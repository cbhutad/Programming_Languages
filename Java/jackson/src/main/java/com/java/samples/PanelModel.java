package com.java.samples;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/*
 * 
 * This class consists of all resposne parameters for all supporting apis.
 * 
 */


@JsonPropertyOrder({"LOINC", "LONG_COMMON_NAME"})
public class PanelModel {

    private String LOINC;
    private String LONG_COMMON_NAME;

    public PanelModel(String LOINC, String LONG_COMMON_NAME) {
        this.LOINC = LOINC;
        this.LONG_COMMON_NAME = LONG_COMMON_NAME;
    }

    @JsonProperty("LOINC")
    public String getLOINC() {
        return this.LOINC;
    }

    @JsonProperty("LOINC")
    public void setLOINC(String LOINC) {
        this.LOINC = LOINC;
    }

    @JsonProperty("LONG_COMMON_NAME")
    public String getLONG_COMMON_NAME() {
        return this.LONG_COMMON_NAME;
    }

    @JsonProperty("LONG_COMMON_NAME")
    public void setLONG_COMMON_NAME(String LONG_COMMON_NAME) {
        this.LONG_COMMON_NAME = LONG_COMMON_NAME;
    }

    @Override
    public String toString() {
        return "Loinc number : " + getLOINC() + " Long Common Name : " + getLONG_COMMON_NAME();
    }
}
