package com.keeppo.api.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.keeppo.api.models.OfferModel;
import com.keeppo.api.repository.OfferRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class OfferServiceTests {
    @Autowired
    OfferRepository offerRepository;

    @Autowired
    OfferService offerService;


    @Test
    void testGetOfferServiceAsLdJson() {
        this.offerRepository.save(new OfferModel("offer1"));
        OfferModel o = this.offerRepository.findById(Long.valueOf("1")).get();
        assertEquals(o.getName(), "offer1");
        assertEquals(o.getId(), 1);
    }
}
