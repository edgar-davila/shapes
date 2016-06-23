package com.test.shapes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

/**
 * Created by Edgar on 6/22/2016.
 */
@Controller
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("com.test.shapes")
public class App {
    public static void main(String[] args) throws Exception {
        //runTest();
        System.setProperty("spring.config.name", "shape-service");
        SpringApplication.run(App.class);
    }
}
