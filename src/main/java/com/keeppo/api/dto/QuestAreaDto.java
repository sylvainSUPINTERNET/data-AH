package com.keeppo.api.dto;



public class QuestAreaDto {
    public Long id;
    public String name;

    public QuestAreaDto(Long id,String name){
        this.name = name;
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
