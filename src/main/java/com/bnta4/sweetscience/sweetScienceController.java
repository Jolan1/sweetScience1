package com.bnta4.sweetscience;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import java.sql.SQLOutput;


@RestController
@RequestMapping(path= "api/sweetscience")
public class sweetScienceController {

    @GetMapping
    public String sayHello(){
        System.out.println("Hello!");
        return "Hello";

    }

    @GetMapping ("user")


    @GetMapping ("element")

}


