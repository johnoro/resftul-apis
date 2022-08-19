package com.johnoro.lorem.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI loremOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Lorem Ipsum API")
                .description("Lorem demo application")
                .version("v1.0.0")
            );
    }
}