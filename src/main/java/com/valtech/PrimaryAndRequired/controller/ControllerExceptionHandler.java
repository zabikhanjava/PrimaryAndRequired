package com.valtech.PrimaryAndRequired.controller;

import com.valtech.PrimaryAndRequired.config.Service;
import com.valtech.PrimaryAndRequired.model.VehicleContentNegociation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class ControllerExceptionHandler {

  @ExceptionHandler(RuntimeException.class)
  public ResponseEntity<Object> handleMbbErrorException(final RuntimeException e) {

    return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
  }
}
