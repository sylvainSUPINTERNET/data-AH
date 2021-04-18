package com.keeppo.api.services;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import com.keeppo.api.models.QuestArea;
import com.keeppo.api.repository.QuestAreaRepository;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
@EnableJpaRepositories
public class QuestAreaTest {
    @Autowired
    QuestAreaRepository questAreaRepository;
        
        @BeforeAll
        public static void initTest(){
        }
            
        @Test
        void testGetQuestArea() throws InterruptedException, ExecutionException {
    		this.questAreaRepository.save(new QuestArea("test14"));
            this.questAreaRepository.save(new QuestArea("test42"));
            List<QuestArea> questAreas = this.questAreaRepository.findAllAreas().get();
            assertEquals(questAreas.size(), 2);
            assertEquals(questAreas.get(0).getName(), "test14");
            assertEquals(questAreas.get(1).getName(), "test42");
        }
}

