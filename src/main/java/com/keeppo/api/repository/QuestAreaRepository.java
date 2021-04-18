package com.keeppo.api.repository;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.keeppo.api.models.QuestArea;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestAreaRepository extends JpaRepository<QuestArea, Long> {
    @Async
	@Query("select a from QuestArea a")
	CompletableFuture<List<QuestArea>> findAllAreas();
}
