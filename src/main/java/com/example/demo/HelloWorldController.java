package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping("/world")
    public String helloWorldPage() {
        return "<html><body><h1 style='font-size:550px'>Hello, World!</h1></body></html>";
    }

}
