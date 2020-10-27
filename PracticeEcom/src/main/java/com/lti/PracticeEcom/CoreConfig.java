package com.lti.PracticeEcom;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.lti.PracticeEcom.controller.ControllerConfig;

@Configuration
@ComponentScan("com.lti.PracticeEcom")
@Import(ControllerConfig.class)
public class CoreConfig {

}
