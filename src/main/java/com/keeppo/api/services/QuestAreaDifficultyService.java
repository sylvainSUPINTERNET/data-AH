package com.keeppo.api.services;

import com.keeppo.api.dto.QuestAreaDifficultyDto;
import com.keeppo.api.models.QuestAreaDifficulty;
import com.keeppo.api.repository.QuestAreaDifficultyRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestAreaDifficultyService {

    @Autowired
    QuestAreaDifficultyRepository questAreaDifficultyRepository;

    ModelMapper modelMapper = new ModelMapper();

    public QuestAreaDifficultyService(){}

    public void initQuestAreaDifficutlies(){
        String[] difficulties = {
            "grey",
            "green",
            "yellow",
            "orange",
            "red"
        };

        for(String dfc: difficulties) {
            QuestAreaDifficultyDto qDifficultyDto = new QuestAreaDifficultyDto(dfc);
            QuestAreaDifficulty questAreaDifficulty = this.modelMapper.map(qDifficultyDto, QuestAreaDifficulty.class);
            
            if ( this.questAreaDifficultyRepository.findByDifficulty(dfc).isEmpty() ) {
                this.questAreaDifficultyRepository.save(questAreaDifficulty);
            }
        }
    }
}
