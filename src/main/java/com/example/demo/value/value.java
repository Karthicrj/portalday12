package com.example.demo.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class value {
	    @Value("65")
        public int regno;
	    @Value("karthic")
        public String name;
	    @RequestMapping("/display")
        public String dispaly()
        {
        	return "My name is"+name+" reg number is"+regno;
        }
}
