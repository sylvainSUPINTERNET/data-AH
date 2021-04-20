package com.keeppo.api.services;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import com.keeppo.api.dto.QuestAreaDto;
import com.keeppo.api.models.QuestArea;
import com.keeppo.api.repository.QuestAreaRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestAreaService {

    @Autowired
    QuestAreaRepository questAreaRepository;

    ModelMapper modelMapper = new ModelMapper();

    public QuestAreaService() {
    }
    
    public QuestAreaDto createQuestArea(String name) {
        QuestArea questArea = new QuestArea(name);
        QuestArea q = this.questAreaRepository.save(questArea);
        QuestAreaDto qDto = this.modelMapper.map(q, QuestAreaDto.class);
        return qDto;

    }

    public List<QuestAreaDto> getQuestAreas() {
        CompletableFuture<List<QuestArea>> futur = this.questAreaRepository.findAllAreas();
        try {
            List<QuestAreaDto> qa = futur.get().stream().map( q -> this.modelMapper.map(q, QuestAreaDto.class)).collect(Collectors.toList());
            return qa;
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            return null;
        }
    }
}
