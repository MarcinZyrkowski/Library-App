package com.library.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomePageController {

    private static final String GREETING_MESSAGE = "hello world from library app";

    @RequestMapping(value = "/library", method = RequestMethod.GET)
    public ResponseEntity<String> getHomePage() {
        return new ResponseEntity<>(GREETING_MESSAGE, HttpStatus.OK);
    }

}
