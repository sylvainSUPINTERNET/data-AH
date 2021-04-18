package com.keeppo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableJpaRepositories
@EnableAsync
public class ApiApplication implements Runnable {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}




	@Override
	public void run() {
	}

}
