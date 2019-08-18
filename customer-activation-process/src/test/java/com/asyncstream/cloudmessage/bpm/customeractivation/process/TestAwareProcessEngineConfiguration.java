package com.asyncstream.cloudmessage.bpm.customeractivation.process;

import org.camunda.bpm.engine.ProcessEngineConfiguration;
import org.camunda.bpm.engine.impl.bpmn.parser.BpmnParseListener;
import org.camunda.bpm.engine.impl.cfg.StandaloneInMemProcessEngineConfiguration;
import org.camunda.bpm.engine.impl.jobexecutor.JobHandler;
import org.camunda.bpm.engine.test.mock.MockExpressionManager;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Supplier;

public class TestAwareProcessEngineConfiguration extends StandaloneInMemProcessEngineConfiguration {

    public static TestAwareProcessEngineConfiguration testAwareProcessEngineConfiguration() {
        return new TestAwareProcessEngineConfiguration();
    }

    public static final Supplier<ProcessEngineConfiguration> SUPPLIER;

    static {
        SUPPLIER = new Supplier<ProcessEngineConfiguration>() {
            @Override
            public ProcessEngineConfiguration get() {
                return testAwareProcessEngineConfiguration();
            }
        };
    }

    private TestAwareProcessEngineConfiguration() {
        this.history = HISTORY_FULL;
        this.databaseSchemaUpdate = DB_SCHEMA_UPDATE_TRUE;
        this.jobExecutorActivate = false;
        this.expressionManager = new MockExpressionManager();
        this.setCustomPostBPMNParseListeners(new ArrayList<>());
        this.setCustomJobHandlers(new ArrayList<>());
    }

    public void addCustomJobHandler(final JobHandler jobHandler) {
        getCustomJobHandlers().add(Objects.requireNonNull(jobHandler));
    }

    public void addCustomPostBpmnParseListener(final BpmnParseListener bpmnParseListener) {
        getCustomPostBPMNParseListeners().add(Objects.requireNonNull(bpmnParseListener));
    }

}
