package com.jazzify.flymetothlive.Lambda.Fucntion;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UppercaseController {

    @PostMapping("/uppercase")
    public String uppercase(@RequestBody String input) {
        return input != null ? input.toUpperCase() : "";
    }
}