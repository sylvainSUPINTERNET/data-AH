package com.keeppo.api.controllers;

import com.keeppo.api.dto.QuestAreaCreateDto;
import com.keeppo.api.dto.QuestAreaDto;
import com.keeppo.api.services.QuestAreaService;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/areas")
public class QuestAreaController {

    @Autowired
    SimpMessagingTemplate messagingTemplate;

    QuestAreaService questAreaService;
    
    public QuestAreaController (QuestAreaService questAreaService) {
        this.questAreaService = questAreaService;
    }

    @PostMapping
    public ResponseEntity<?> addQuestArea(@RequestBody QuestAreaCreateDto questAreaCreateDto) {

        QuestAreaDto qad = this.questAreaService.createQuestArea(questAreaCreateDto.getName());
        this.messagingTemplate.convertAndSend("/topic/questarea", qad);
        return ResponseEntity.status(HttpStatus.SC_OK).body(qad);
    }

    @GetMapping
    public ResponseEntity<?> getQuestsAreas() {
        if ( this.questAreaService.getQuestAreas() == null ) {
            return ResponseEntity.status(HttpStatus.SC_BAD_REQUEST).body(this.questAreaService.getQuestAreas());
        } else {
            return ResponseEntity.status(HttpStatus.SC_OK).body(this.questAreaService.getQuestAreas());
        }
    }
    
}
