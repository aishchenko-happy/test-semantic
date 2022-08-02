package com.example.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class HelloControllerTest {

    private HelloController controller = new HelloController();

    @Test
    public void test() {
        assertEquals("Hello2", controller.getHello().getBody());
    }
}
