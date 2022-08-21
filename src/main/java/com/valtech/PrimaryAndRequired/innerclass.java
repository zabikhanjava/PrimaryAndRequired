package com.valtech.PrimaryAndRequired;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.print.attribute.IntegerSyntax;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class innerclass {
static int b;
  public static void main(String[] args) {
    pop popp=new pop();
    pop.some();
  }

  public static class pop {

   static int a;

    public static void some() {
      a = 10;
      System.out.println(a+b);
    }
  }
}
