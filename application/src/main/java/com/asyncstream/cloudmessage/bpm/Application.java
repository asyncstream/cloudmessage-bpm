package com.asyncstream.cloudmessage.bpm;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EnableProcessApplication
public class Application extends SpringBootServletInitializer {
    private  static final Logger LOG = LoggerFactory.getLogger(Application.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder){
        return applicationBuilder.sources(Application.class);
    }

    public static void main(String[] args){
        LOG.info("Starting cloudmessage bpm application");
        SpringApplication.run(Application.class,args);
    }
}
