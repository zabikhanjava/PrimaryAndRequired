package com.valtech.PrimaryAndRequired.controller;

import com.valtech.PrimaryAndRequired.config.Service;
import com.valtech.PrimaryAndRequired.model.VehicleContentNegociation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContentNegociationController {

  @Autowired
  Service service;

  @GetMapping(value = "FD",produces = {"application/xml","application/json"})
  public VehicleContentNegociation pop()
  {
    return new VehicleContentNegociation(2,"ds","ds");

  }
  @GetMapping(value = "/finalling")
  public String checkfinal()
  {
    return service.display();

  }
}
