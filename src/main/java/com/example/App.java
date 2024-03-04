package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins = "*", maxAge = 3600)
//@EnableMongoAuditing
//@EnableReactiveMongoRepositories
//@ComponentScan({"com.example"})
//@EnableMongoRepositories("com.example")
@SpringBootApplication
@RestController
public class App extends SpringBootServletInitializer {

    @GetMapping("/")
    public String getMessage(){
        return "Hurray2!!";
    }

    @PostMapping("/{input}")
    public String getMessage(@PathVariable String input){
        return "Input parameter is "+input;
    }




    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }




}