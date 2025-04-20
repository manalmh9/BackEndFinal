package com.ufolep.polytech.configuration;




import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("https://localhost:3000", "https://10.192.108.185:3000") // Explicitly list the allowed origins
                        .allowedMethods("*")
                        .allowedHeaders("*")
                        .allowCredentials(true); // Allow credentials (cookies, HTTP authentication, etc.)
            }
        };
    }
}
