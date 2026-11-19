package com.bleriot.demoapi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloControllerTest {

    @Test
    void helloReturnsMessage() {
        HelloController controller = new HelloController();
        assertEquals("Hello DevOps", controller.hello().get("message"));
    }
}