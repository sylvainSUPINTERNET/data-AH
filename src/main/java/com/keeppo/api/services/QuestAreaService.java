package com.keeppo.api.services;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import com.keeppo.api.dto.QuestAreaDto;
import com.keeppo.api.models.QuestArea;
import com.keeppo.api.repository.QuestAreaRepository;

import org.springframework.stereotype.Service;

@Service
public class QuestAreaService {

    QuestAreaRepository questAreaRepository;

    public QuestAreaService() {}
    
    public QuestAreaService(QuestAreaRepository questAreaRepository){
        this.questAreaRepository = questAreaRepository;
    }


    public List<QuestAreaDto> getQuestAreas() {
        CompletableFuture<List<QuestArea>> futur = this.questAreaRepository.findAllAreas();
        try {
            List<QuestAreaDto> qa = futur.get().stream().map( q -> new QuestAreaDto(q.getName())).collect(Collectors.toList());
            return qa;
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            return null;
        }
    }
}
