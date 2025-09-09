//The example class provide a simple of what you would see in a web browser
package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

        //Responds to requests at the root path
        @RequestMapping("/")
        String home(){
        return "Hello World! What are your plans for today?";
        }

        //Entry Point to start the Spring boot
        public static void main(String[]args){
            SpringApplication.run(Example.class, args);
        }
}
