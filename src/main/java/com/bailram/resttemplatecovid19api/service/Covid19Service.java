package com.bailram.resttemplatecovid19api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class Covid19Service {
    private static final String API_KEY = "bbc1fa6fdfmsh094de6847c00a18p1962b2jsn15b4949b783a";
    private static final String API_HOST = "covid-193.p.rapidapi.com";
    private static final String API_BASE_URL = "https://covid-193.p.rapidapi.com/";

    @Autowired
    RestTemplate restTemplate;

    public ResponseEntity<String> getCountries() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("X-Rapidapi-Key", API_KEY);
        headers.set("X-Rapidapi-Host", API_HOST);
        HttpEntity <String> entity = new HttpEntity<String>(headers);

        return restTemplate.exchange(
                API_BASE_URL+"countries", HttpMethod.GET, entity, String.class);
    }

    public ResponseEntity<String> getStatistics() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("X-Rapidapi-Key", API_KEY);
        headers.set("X-Rapidapi-Host", API_HOST);
        HttpEntity <String> entity = new HttpEntity<String>(headers);

        return restTemplate.exchange(
                API_BASE_URL+"statistics", HttpMethod.GET, entity, String.class);
    }

    public ResponseEntity<String> getHistory(String countryCode, String date) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("X-Rapidapi-Key", API_KEY);
        headers.set("X-Rapidapi-Host", API_HOST);
        HttpEntity <String> entity = new HttpEntity<String>(headers);

        return restTemplate.exchange(
                API_BASE_URL+"history?country="+countryCode+"&day="+date, HttpMethod.GET, entity, String.class);
    }
    public ResponseEntity<String> getHistory(String countryCode, String date, String senggoldong) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("X-Rapidapi-Key", API_KEY);
        headers.set("X-Rapidapi-Host", API_HOST);
        HttpEntity <String> entity = new HttpEntity<String>(headers);

        return restTemplate.exchange(
                API_BASE_URL+"history?country="+countryCode+"&day="+date, HttpMethod.GET, entity, String.class);
    }
}
