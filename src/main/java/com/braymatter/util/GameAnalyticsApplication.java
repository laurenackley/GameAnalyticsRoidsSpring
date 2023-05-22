package com.braymatter.util;

import com.datastax.oss.driver.api.core.CqlSessionBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cassandra.CqlSessionBuilderCustomizer;
import org.springframework.context.annotation.Bean;

import java.nio.file.Path;

@SpringBootApplication
public class GameAnalyticsApplication {
    public static void main(String[] args) {
        SpringApplication.run(GameAnalyticsApplication.class, args);
    }

//    @Bean
//    public CqlSessionBuilderCustomizer sessionBuilderCustomizer(DataStaxAstraProperties astaProperties) {
//        Path bundle = astaProperties.getSecureConnectBundle().toPath();
//        return builder -> builder.withCloudSecureConnectBundle(bundle);
//    }
}
