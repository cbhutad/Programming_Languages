package com.java.samples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class JacksonApp 
{

    public static void main( String[] args ) throws JsonProcessingException
    {
        PanelModel panelModel = new PanelModel("111111", "common long name");
        System.out.println(panelModel);
        
        String result = new ObjectMapper().writeValueAsString(panelModel);
        System.out.println(result);
    }
}
