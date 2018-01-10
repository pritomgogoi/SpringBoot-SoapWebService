package com.poc.spring.soapwebservice.webservice;

import com.poc.spring.soapwebservice.service.CountryService;
import net.webservicex.CountryHttpPost;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;

/**
 * @author by Pritom Gogoi
 */
@WebService(endpointInterface = "net.webservicex.CountryHttpPost")
public class CountryPortTypeImpl implements CountryHttpPost{

    @Autowired
    private CountryService countryService;

    @Override
    public String getCurrencyByCountry(String countryName) {

        return countryService.getCurrencyByCountry(countryName);
    }

    @Override
    public String getCurrencies() {
        return null;
    }

    @Override
    public String getISD(String countryName) {
        return null;
    }

    @Override
    public String getCountryByCurrencyCode(String currencyCode) {
        return null;
    }

    @Override
    public String getISOCountryCodeByCountyName(String countryName) {
        return null;
    }

    @Override
    public String getCurrencyCode() {
        return null;
    }



    @Override
    public String getCountries() {
        return null;
    }

    @Override
    public String getCurrencyCodeByCurrencyName(String currencyName) {
        return null;
    }

    @Override
    public String getGMTbyCountry(String countryName) {
        return null;
    }

    @Override
    public String getCountryByCountryCode(String countryCode) {
        return null;
    }
}
