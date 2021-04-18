package com.keeppo.api.controllers;

import com.keeppo.api.services.QuestAreaService;

import org.apache.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/areas")
public class QuestAreaController {

    QuestAreaService questAreaService;
    
    public QuestAreaController (QuestAreaService questAreaService) {
        this.questAreaService = questAreaService;
    }

    @PostMapping
    public ResponseEntity<?> addQuestArea(@RequestBody String name) {
        return ResponseEntity.status(HttpStatus.SC_OK).body(this.questAreaService.createQuestArea(name));
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
