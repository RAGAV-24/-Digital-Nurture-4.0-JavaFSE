package com.cognizant.spring_learn;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {

    private static final Logger LOG = LoggerFactory.getLogger(Country.class);
    private String name;
    private String code;

    public Country(){
        LOG.debug("Inside Country Constructor");
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        name = name;
    }

    public void setCode(String code) {
        code = code;
    }


    @Override
    public String toString(){
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
