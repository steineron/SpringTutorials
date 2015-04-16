package org.steiner.tutorials.spring.sample.hello.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rosteiner on 4/15/15.
 */
@RestController
public class HelloController {

    @Value("${app.name}")
    private String appName;

    @RequestMapping("/hello")
    public String hello(){
        return "HELLO from "+appName;
    }
}
