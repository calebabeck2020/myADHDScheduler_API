package com.coaxial_cable.myADHDScheduler_API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestMyAdhdSchedulerApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(MyAdhdSchedulerApiApplication::main).with(TestMyAdhdSchedulerApiApplication.class).run(args);
	}

}
