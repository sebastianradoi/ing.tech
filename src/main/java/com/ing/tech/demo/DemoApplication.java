package com.ing.tech.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import utils.BcryptHasing;

@EnableAutoConfiguration
@ComponentScan("com.ing.tech")
@SpringBootApplication
@Configuration
@EnableJpaRepositories("com.ing.tech.data")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	public BcryptHasing getBCryptHashing() {
		return new BcryptHasing();
	}
}
