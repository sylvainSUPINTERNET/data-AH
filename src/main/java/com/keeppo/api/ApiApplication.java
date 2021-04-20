package com.keeppo.api;

import com.keeppo.api.services.QuestAreaDifficultyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner  {

	@Autowired
	QuestAreaDifficultyService questAreaDifficultyService;

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.questAreaDifficultyService.initQuestAreaDifficutlies();
	}

}
