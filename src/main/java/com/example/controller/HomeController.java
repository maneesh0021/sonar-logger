package com.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        log.info("Accessed /home endpoint");
        model.addAttribute("message", "Hello from Spring MVC Controller!");
        return "home";
    }
}
