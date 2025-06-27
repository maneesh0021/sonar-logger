package com.example.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class HomeControllerTest {

    private HomeController controller;
    private Model mockModel;

    @BeforeEach
    void setUp() {
        controller = new HomeController();
        mockModel = Mockito.mock(Model.class);
    }

    @Test
    void testHomeViewNameAndMessage() {
        String viewName = controller.home(mockModel);

        assertEquals("home", viewName);
        verify(mockModel).addAttribute("message", "Hello from Spring MVC Controller!");
    }
}
