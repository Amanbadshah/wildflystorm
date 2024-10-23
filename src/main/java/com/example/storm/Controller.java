package com.example.storm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
    @GetMapping("/")
    public String getSecret() {
    	 String str ;
    	 str ="Fazal Controller"; 
         return str;
    }
}
