package com.restfull.chungkhoanapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ChungkhoanapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChungkhoanapiApplication.class, args);
    }

}
