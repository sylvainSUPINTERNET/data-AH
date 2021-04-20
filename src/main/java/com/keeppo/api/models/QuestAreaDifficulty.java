package com.keeppo.api.models;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table( name = "quest_area_difficulty" )
public class QuestAreaDifficulty {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
        
    private String difficulty;

    @OneToMany( mappedBy = "questAreaDifficulty", fetch = FetchType.EAGER)
    private Set<QuestArea> questAreas;

    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public QuestAreaDifficulty(){}

    public QuestAreaDifficulty(String difficulty){
        this.difficulty = difficulty;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
    public LocalDateTime getCreatedAt(){
        return this.createdAt;
    }

    public LocalDateTime setUpDateTime(){
        return this.updatedAt;
    }
    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }


    

}
