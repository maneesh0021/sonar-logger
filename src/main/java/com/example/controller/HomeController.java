package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/home")
    public String home(Model model) {
        log.info("Accessed /home endpoint");
        model.addAttribute("message", "Hello from Spring MVC Controller!");
        return "home";
    }
}
