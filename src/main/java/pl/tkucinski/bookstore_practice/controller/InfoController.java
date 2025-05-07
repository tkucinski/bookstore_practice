package pl.tkucinski.bookstore_practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * basic controller for initial testing purposes
 *
 */

@RestController
public class InfoController {

    @GetMapping("/info")
    public String getHello() {
        return "Hello from our bookstore service!";
    }
}
