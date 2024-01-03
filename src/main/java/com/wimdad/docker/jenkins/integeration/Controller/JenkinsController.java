package com.wimdad.docker.jenkins.integeration.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {
    @GetMapping("/")
    public String message() {
        return "Jenkins integration completed";
    }
}
