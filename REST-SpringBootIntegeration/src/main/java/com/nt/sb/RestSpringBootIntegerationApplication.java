package com.nt.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "com.nt.sb.*")

public class RestSpringBootIntegerationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestSpringBootIntegerationApplication.class, args);
	}

}
