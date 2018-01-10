package com.poc.spring.soapwebservice.dao;

import org.springframework.stereotype.Repository;

/**
 * @author by Pritom Gogoi
 */
@Repository
public class CountryDao {

    public String getCurrencyByCountry(final String countryName){
        if("USA".equals(countryName)){
            return "USD";
        }else{
            return null;
        }
    }
}
