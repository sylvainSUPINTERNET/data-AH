package com.keeppo.api.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table( name = "areas")
public class QuestArea {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "difficulty_id", nullable=true)
    private QuestAreaDifficulty questAreaDifficulty;

    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public QuestArea(){}

    public QuestArea(String name) {
        this.name = name;

    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreatedAt(){
        return this.createdAt;
    }

    public LocalDateTime setUpDateTime(){
        return this.updatedAt;
    }

    public QuestAreaDifficulty getQuestAreaDifficulty(){
        return this.questAreaDifficulty;
    }

    public void setQuestArDifficulty(QuestAreaDifficulty questAreaDifficulty){
        this.questAreaDifficulty = questAreaDifficulty;
    }

    
}
