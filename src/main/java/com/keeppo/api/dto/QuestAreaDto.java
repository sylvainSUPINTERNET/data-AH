package com.keeppo.api.dto;
public class QuestAreaDto {
    public long id;
    public String name;

    public QuestAreaDto(){
        
    }

    public QuestAreaDto(long id,String name){
        this.name = name;
        this.id = id;
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
}
