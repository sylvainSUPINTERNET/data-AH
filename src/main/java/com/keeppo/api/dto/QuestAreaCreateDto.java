package com.keeppo.api.dto;

public class QuestAreaCreateDto {
    public String name;
    public String difficulty;

    public QuestAreaCreateDto(){}

    public QuestAreaCreateDto(String name, String difficulty){
        this.name = name;
        this.difficulty = difficulty;
    }
    
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDifficulty(){
        return this.difficulty;
    }

    public void setDifficulty(String difficulty){
        this.difficulty = difficulty;
    }


}
