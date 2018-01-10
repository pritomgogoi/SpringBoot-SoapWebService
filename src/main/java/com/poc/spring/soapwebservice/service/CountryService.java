package com.poc.spring.soapwebservice.service;

import com.poc.spring.soapwebservice.dao.CountryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author by Pritom Gogoi
 */
@Service
public class CountryService {

    @Autowired
    private CountryDao countryDao;

    public String getCurrencyByCountry(final String countryName){
        return countryDao.getCurrencyByCountry(countryName);
    }

}
