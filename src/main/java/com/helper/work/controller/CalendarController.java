package com.helper.work.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalendarController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @GetMapping("/hello")
    public String getCalendar() {
        return "hello";
    }
}
