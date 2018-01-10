package com.poc.spring.soapwebservice.configs;


import com.poc.spring.soapwebservice.webservice.CountryPortTypeImpl;
import net.webservicex.Country;
import net.webservicex.CountryHttpGet;
import net.webservicex.CountryHttpPost;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import javax.xml.ws.Endpoint;
import java.io.IOException;

/**
 * @author by Pritom Gogoi
 */

@Configuration
public class CXFConfig {

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public CountryHttpPost countryHttpPost() {
        return new CountryPortTypeImpl();
    }

    @Bean
    public Country country() throws IOException {
        return new Country(new ClassPathResource("wsdl/Countries.wsdl").getURL());
    }

    @Bean
    public Endpoint countriesEndpoint() throws Exception {
        final EndpointImpl endpoint = new EndpointImpl(springBus(), countryHttpPost());
        endpoint.setServiceName(country().getServiceName());
        endpoint.setWsdlLocation(country().getWSDLDocumentLocation().toString());
        endpoint.publish("/countries");
        return endpoint;
    }

}