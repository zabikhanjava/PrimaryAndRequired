package com.valtech.PrimaryAndRequired.controller;

import com.valtech.PrimaryAndRequired.service.Animal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SomeController {

    @Qualifier("dog")
    @Autowired(required = true)
    Animal service;

    @GetMapping("/")
    public String pop()
    {

        log.info("d");
        return service.main();
    }
}
