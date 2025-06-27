package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    // Handles root path and redirects to /home
    @GetMapping("/")
    public String redirectToHome() {
        logger.info("Redirecting to /home");
        return "redirect:/home";
    }

    // Handles /home and returns home view
    @GetMapping("/home")
    public String home(Model model) {
        logger.info("Inside HomeController - home() called");
        model.addAttribute("welcomeMessage", "Welcome to the home page!");
        return "home";
    }
}
