package com.valtech.PrimaryAndRequired.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class Service {

  final FinalDependecy dependecy;
  public String P()
  {
    return dependecy.display();
  }

  public String display()
  {
    throw new NullPointerException();
   // return dependecy.display();
  }
}
