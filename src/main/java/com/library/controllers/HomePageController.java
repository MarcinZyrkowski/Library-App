package com.library.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    private static final String GREETING_MESSAGE = "hello world from library app";

    @GetMapping(value = {"/"})
    public ResponseEntity<String> getHomePage() {
        return new ResponseEntity<>(GREETING_MESSAGE, HttpStatus.OK);
    }

}
