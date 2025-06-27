package com.example.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ExtendedModelMap;

import static org.junit.jupiter.api.Assertions.*;

class HomeControllerTest {

    private HomeController controller;

    @BeforeEach
    void setUp() {
        controller = new HomeController();
    }

    @Test
    void testHomeViewNameAndMessage() {
        ExtendedModelMap model = new ExtendedModelMap();
        String viewName = controller.home(model);

        assertEquals("home", viewName);
        assertTrue(model.containsAttribute("message"));
        assertEquals("Hello from Spring MVC Controller!", model.get("message"));
    }
}
