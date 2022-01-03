package com.valtech.PrimaryAndRequired.controller;

import com.valtech.PrimaryAndRequired.service.Animal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
public class Some {
    static int staticdatavariable;
    int instancedatavariable;

    static {
        System.out.println("static instance "+staticdatavariable);
        staticdatavariable = 10;
        System.out.println("static instance "+staticdatavariable);
    }
    {
        System.out.println(" instance "+instancedatavariable);
        instancedatavariable = 10;
        System.out.println(" instance "+instancedatavariable);
    }
    Some(int instancedatavariable)
    {
        System.out.println("arg constructor");
        staticdatavariable=30;
        instancedatavariable=30;
        System.out.println("arg constructor staticdatavariable="+staticdatavariable);
        System.out.println("arg constructor instancedatavariable="+instancedatavariable);
    }  Some()
    {
        System.out.println(" constructor");
        staticdatavariable=400;
        instancedatavariable=40;
        System.out.println(" constructor staticdatavariable="+staticdatavariable);
        System.out.println(" constructor instancedatavariable="+instancedatavariable);

    }
    public static void main(String[] args) {
    Some some=new Some(10);
    log.info("hello g");
    }
}
