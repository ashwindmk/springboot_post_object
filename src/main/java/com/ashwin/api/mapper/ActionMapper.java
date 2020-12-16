package com.ashwin.api.mapper;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class ActionMapper {
    private static ObjectMapper objectMapper = null;
    static {
        objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    public static <T extends Object>  T copyFromObject(Object from, Class<T> classz){
        try {
            return jsonToObject(objectToJson(from), classz);
        } catch (Exception e) {
            System.out.println("ActionMapper | copyFromObject | error");
            e.printStackTrace();
            return null;
        }
    }

    public static <T extends Object>  T jsonToObject(String value, Class<T> classz) throws Exception {
        T result = null;
        try {
            result = objectMapper.readValue(value, classz);
        } catch (IOException e) {
            System.out.println("ActionMapper | jsonToObject | error");
            //e.printStackTrace();
            throw e;
        }
        return result;
    }

    public static String objectToJson(Object value) throws Exception {
        String result = null;
        try {
            result = objectMapper.writeValueAsString(value);
        } catch (JsonProcessingException e) {
            System.out.println("ActionMapper | objectToJson | error");
            //e.printStackTrace();
            throw e;
        }
        return result;
    }
}
