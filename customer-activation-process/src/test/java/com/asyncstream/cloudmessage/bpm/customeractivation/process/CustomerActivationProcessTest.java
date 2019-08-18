package com.asyncstream.cloudmessage.bpm.customeractivation.process;

import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.task.Task;
import org.camunda.bpm.engine.test.Deployment;
import org.camunda.bpm.engine.test.ProcessEngineRule;
import org.camunda.bpm.engine.test.mock.Mocks;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static com.asyncstream.cloudmessage.bpm.customeractivation.process.TestAwareProcessEngineConfiguration.testAwareProcessEngineConfiguration;
import static org.assertj.core.api.Assertions.assertThat;
import static org.camunda.bpm.extension.mockito.DelegateExpressions.autoMock;
import static org.camunda.bpm.extension.mockito.DelegateExpressions.verifyExecutionListenerMock;
import static org.camunda.bpm.extension.mockito.DelegateExpressions.verifyJavaDelegateMock;
import static org.camunda.bpm.extension.mockito.ProcessExpressions.registerCallActivityMock;

public class CustomerActivationProcessTest {

    private static final String MESSAGE_ACTIVATION_RESULT = "Message_Activation_Result";
    private static final String RECIEVE_ACTIVITY="process_activation_result";
    @Rule
    public final ProcessEngineRule processEngineRule = new ProcessEngineRule(testAwareProcessEngineConfiguration().buildProcessEngine());

    private TaskService taskService;

    @Before
    public void setUp() {
        taskService = processEngineRule.getTaskService();
    }

    @Test
    @Deployment(resources = "bpmn/customer-activation.bpmn")
    public void register_mocks_for_all_listeners_and_delegates() throws Exception {
        autoMock("bpmn/customer-activation.bpmn");

        assertThat(Mocks.get("startActivation")).isNotNull();
        assertThat(Mocks.get("processActivationResult")).isNotNull();
        assertThat(Mocks.get("completeActivation")).isNotNull();
        assertThat(Mocks.get("sendActivationRequest")).isNotNull();
        processEngineRule.manageDeployment(registerCallActivityMock(RECIEVE_ACTIVITY)
                .onExecutionWaitForMessage(MESSAGE_ACTIVATION_RESULT)
                .deploy(processEngineRule));

        final ProcessInstance processInstance = processEngineRule.getRuntimeService().startProcessInstanceByKey("process_customer_activation");
        verifyMocksBeforeCustomerResponse();
        processEngineRule.getRuntimeService().correlateMessage(MESSAGE_ACTIVATION_RESULT);
        verifyMocksAfterCustomerResponse();

    }

    private void verifyMocksBeforeCustomerResponse() {
        verifyExecutionListenerMock("startActivation").executed();
        verifyJavaDelegateMock("sendActivationRequest").executed();
    }

    private void verifyMocksAfterCustomerResponse() {
        verifyExecutionListenerMock("processActivationResult").executed();
        verifyJavaDelegateMock("completeActivation").executed();
    }

}
