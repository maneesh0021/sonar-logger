package com.example.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class HomeControllerTest {

    private HomeController controller;
    private Model mockModel;

    @BeforeEach
    void setUp() {
        controller = new HomeController();
        mockModel = mock(Model.class);
    }

    @Test
    void testRedirectToHome() {
        String viewName = controller.redirectToHome();
        assertEquals("redirect:/home", viewName);
    }

    @Test
    void testHomeReturnsHomeView() {
        String viewName = controller.home(mockModel);
        assertEquals("home", viewName);
    }

    @Test
    void testHomeSetsWelcomeMessage() {
        controller.home(mockModel);
        verify(mockModel).addAttribute("welcomeMessage", "Welcome to the home page!");
    }
}
