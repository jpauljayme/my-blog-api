package dev.mayhm.blog.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfig {
    private static final Logger logger = LoggerFactory.getLogger(OpenApiConfig.class);

        @Bean
    public OpenAPI customOpenAPI() {
        logger.info("Configuring OpenAPI custom information");
        return new OpenAPI()
                .info(new Info().title("The Fig Tree API")
                        .description("'The fig tree is a personal blog of John Paul Jayme, where he curates his reviews" +
                                " on Literature, Film, Music, and his dwellings with his cats and dogs!")
                        .version("v1.0")
                        .contact(new Contact().name("John Paul Jayme")
                                .url("https://jayme-blog-api.onrender.com/")
                                .email("jp.r.jayme@gmail.com")))
                .servers(List.of(new Server()
                        .url("https://api.example.com")
                        .description("Production server"))
                );
    }
}