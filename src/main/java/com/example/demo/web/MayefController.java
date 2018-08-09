package com.example.demo.web;

import org.mapstruct.MapMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MayefController {

    @RequestMapping(value = "myf", method = RequestMethod.GET)
    public String sb() {
        return "SDF";
    }
}
