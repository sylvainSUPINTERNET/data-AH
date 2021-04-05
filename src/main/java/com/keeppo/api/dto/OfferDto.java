package com.keeppo.api.dto;

import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldId;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldNamespace;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldProperty;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldResource;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;

@JsonldResource
@JsonldNamespace(name = "schema", uri="https://schema.org/")
@JsonldType("schema:Offer")
//@JsonldLink(rel = "s:knows", name = "knows", href = "http://example.com/person/2345")
public class OfferDto {

    @JsonldId
    public String id;

    @JsonldProperty("schema:name")
    public String name;

    public OfferDto(){}
    public OfferDto(String name) {
        this.name = name;
    }

    /**
     * @return Long return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
