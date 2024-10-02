package com.awaken.rest_with_spring_boot_and_java_danilo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GrettingController {

    private static final String template = "Hello, %s!";
    private static final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Gretting gretting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Gretting(counter.incrementAndGet(), String.format(template, name)
        );
    }
}
