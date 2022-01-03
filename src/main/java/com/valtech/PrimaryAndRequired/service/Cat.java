package com.valtech.PrimaryAndRequired.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
public class Cat implements Animal{

    public String main(){
    return "meow";
    }

}
