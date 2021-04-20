package com.keeppo.api.dto;

public class QuestAreaCreateDto {
    public String name;

    public QuestAreaCreateDto(){}

    public QuestAreaCreateDto(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
