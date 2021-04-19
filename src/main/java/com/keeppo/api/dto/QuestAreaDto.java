package com.keeppo.api.dto;
public class QuestAreaDto {
    public long id;
    public String name;
    public String difficulty;

    public QuestAreaDto(){
        
    }

    public QuestAreaDto(long id,String name, String difficulty){
        this.name = name;
        this.id = id;
        this.difficulty = difficulty;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDifficulty() {
        return this.difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}
