package com.keeppo.api.controllers;

import java.util.List;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.keeppo.api.dto.OfferDto;
import com.keeppo.api.repository.OfferRepository;
import com.keeppo.api.services.OfferService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/offers")
public class OfferController {

    @Autowired
    OfferRepository offerRepository;

    @Autowired
    OfferService OfferService;

    @GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getOffers() {
        List<Object> offers = this.OfferService.getOffersJSONLd().stream().map(o -> new Gson().fromJson(o, Object.class)).collect(Collectors.toList());        
        if ( offers.isEmpty() ) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(offers);
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(offers);
        }
    }

}
