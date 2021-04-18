package com.keeppo.api.dto;



public class QuestAreaDto {
    public String name;

    public QuestAreaDto(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
