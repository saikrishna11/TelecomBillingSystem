package com.telecom.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import static com.telecom.common.utils.Constants.CROSS_ORIGIN_URL;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(CROSS_ORIGIN_URL)
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
//                .allowedMethods("*")
                .allowedHeaders("*")
                .allowCredentials(true);
        }
}
