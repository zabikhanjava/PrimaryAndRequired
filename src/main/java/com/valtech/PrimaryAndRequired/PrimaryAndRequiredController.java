package com.valtech.PrimaryAndRequired;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimaryAndRequiredController {
	@Autowired
	ConfigProperties conf;

	@RequestMapping(method = RequestMethod.GET,value="/")
	public  void maini(@RequestParam String s) {

		System.out.println(conf.getId()+conf.getName());

		String sss="pop";
		System.out.println(s.hashCode()+sss.hashCode());


	}
}
