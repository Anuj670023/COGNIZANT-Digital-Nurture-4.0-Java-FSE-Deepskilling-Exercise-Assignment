package com.cognizant.spring_learn;

import org.springframework.stereotype.Service;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@Service
public class CountryService {
    private final List<Country> countries;

    public CountryService() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        this.countries = (List<Country>) context.getBean("countryList");
        context.close();
    }

    public Country getCountry(String code) {
        return countries.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new CountryNotFoundException(code));
    }

    public List<Country> getAllCountries() {
        return countries;
    }
}