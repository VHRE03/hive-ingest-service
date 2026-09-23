package com.vhre.ingest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HiveIngestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HiveIngestServiceApplication.class, args);
    }

}
