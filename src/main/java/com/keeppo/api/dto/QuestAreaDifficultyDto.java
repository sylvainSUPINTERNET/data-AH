package com.keeppo.api.dto;

public class QuestAreaDifficultyDto {
    public long id;
    public String difficulty;

    public QuestAreaDifficultyDto(){
        
    }

    public QuestAreaDifficultyDto(long id,String difficulty){
        this.difficulty = difficulty;
        this.id = id;
    }

    public QuestAreaDifficultyDto(String difficulty){
        this.difficulty = difficulty;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getDifficulty() {
        return this.difficulty;
    }

    public void setDifficulty(String difficulty){
        this.difficulty = difficulty;
    }
}
