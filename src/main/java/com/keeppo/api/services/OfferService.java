package com.keeppo.api.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keeppo.api.dto.OfferDto;
import com.keeppo.api.models.OfferModel;
import com.keeppo.api.repository.OfferRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ioinformarics.oss.jackson.module.jsonld.JsonldModule;

@Service
public class OfferService {

    @Autowired
    OfferRepository offerRepository;

    ModelMapper modelMapper = new ModelMapper();

    public OfferService() {
    }

    public List<String> getOffersJSONLd() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JsonldModule());

        Iterable<OfferModel> offers = this.offerRepository.findAll();
        List<OfferDto> offersDto = StreamSupport.stream(offers.spliterator(), false)
                .map(offer -> this.modelMapper.map(offer, OfferDto.class)).collect(Collectors.toList());

        return offersDto.stream().map(dto -> {
            try {
                return objectMapper.writeValueAsString(dto);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            return null;
        })
        .collect(Collectors.toList());

     
    }

}
