package com.bailram.resttemplatecovid19api.controller;

import com.bailram.resttemplatecovid19api.service.Covid19Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Covid19Controller {
    @Autowired
    Covid19Service covid19Service;

    @GetMapping("api/countries")
    public ResponseEntity<String> getCountries() {
        return covid19Service.getCountries();
    }

    @GetMapping("api/statistics")
    public ResponseEntity<String> getStatistics() {
        return covid19Service.getStatistics();
    }

    @GetMapping("api/history")
    public ResponseEntity<String> getHistory(@RequestParam("country") String countryCode, @RequestParam("date") String date) {
        return covid19Service.getHistory(countryCode, date);
    }
}
