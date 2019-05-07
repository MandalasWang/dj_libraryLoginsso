package com.djcps.dj_library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DjLibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(DjLibraryApplication.class, args);
    }

}
