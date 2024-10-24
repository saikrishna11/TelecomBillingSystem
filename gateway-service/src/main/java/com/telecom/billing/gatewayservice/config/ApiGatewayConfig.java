package com.telecom.billing.gatewayservice.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfig {
    @Bean
    public RouteLocator customRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("billing_service", r -> r.path("/bills/**")
                        .uri("lb://billing-service"))
                .route("customer_service", r -> r.path("/customers/**")
                        .uri("lb://customer-service"))
                .route("plan_service", r -> r.path("/plans/**")
                        .uri("lb://plan-service"))
                .build();
    }
}
