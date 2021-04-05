package com.keeppo.api.repository;

import com.keeppo.api.models.OfferModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends CrudRepository<OfferModel, Long> {}
