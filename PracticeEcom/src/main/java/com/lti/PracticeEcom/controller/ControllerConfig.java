package com.lti.PracticeEcom.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfig {

	@Bean
    ReportController reportController() {
		return new ReportController();
	}

	@Bean
	LoginController loginController() {return new LoginController(); }

}
