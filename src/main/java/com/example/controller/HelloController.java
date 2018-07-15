package com.example.controller;

import com.example.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public @ResponseBody
    Greeting index(String no) {
        if (no == null) {
            return new Greeting("No params");
        }
        try {
            return new Greeting(Integer.parseInt(no));
        } catch (NumberFormatException e) {
            return new Greeting("Invalid nuber");
        }
    }

}