package com.rab3tech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplictionStartBoot {
	public static void main(String[] args) {
		SpringApplication application =new SpringApplication();
		application.run(ApplictionStartBoot.class, args);
	}

}
