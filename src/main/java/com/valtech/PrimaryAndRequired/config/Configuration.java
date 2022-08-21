package com.valtech.PrimaryAndRequired.config;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

  @Bean
  public FinalDependecy pop()
  {
    return new FinalDependecy();
  }
}
