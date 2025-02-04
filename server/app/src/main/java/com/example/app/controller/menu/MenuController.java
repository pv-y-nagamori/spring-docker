package com.example.app.controller.menu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class MenuController {

    private final Logger logger = LoggerFactory.getLogger(MenuController.class);

    @GetMapping("/menu")
    public String menu() {
        return "menu";
    }
}

