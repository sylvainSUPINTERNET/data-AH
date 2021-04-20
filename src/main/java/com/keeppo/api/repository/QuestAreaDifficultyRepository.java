package com.keeppo.api.repository;

import java.util.Optional;

import com.keeppo.api.models.QuestAreaDifficulty;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestAreaDifficultyRepository extends PagingAndSortingRepository<QuestAreaDifficulty, Long>  {
    public Optional<QuestAreaDifficulty> findByDifficulty(String difficulty);
}
