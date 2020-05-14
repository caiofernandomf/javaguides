package net.javaguides.springboot.Springboothellworldapplication.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.Springboothellworldapplication.model.Greeting;
@RestController
public class GreetingController {

    private static final String template ="Hello, %s";
    
    private AtomicLong counter = new AtomicLong();
    
    @RequestMapping("greeting")
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}