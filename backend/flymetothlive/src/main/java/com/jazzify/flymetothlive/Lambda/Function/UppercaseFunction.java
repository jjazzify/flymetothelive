package com.jazzify.flymetothlive.Lambda.Fucntion;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class UppercaseFunction {

    @Bean
    public Function<String, String> uppercase() {
        return input -> input != null ? input.toUpperCase() : "";
    }
}