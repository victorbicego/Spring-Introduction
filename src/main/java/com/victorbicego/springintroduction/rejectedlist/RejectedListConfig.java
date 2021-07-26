package com.victorbicego.springintroduction.rejectedlist;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RejectedListConfig {

    @Bean
    SimpleRejectedList simpleRejectedList() {
        return new SimpleRejectedList();
    }

}
