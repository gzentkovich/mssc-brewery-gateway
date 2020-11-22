package com.vanquish.msscbrewerygateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

public class GoogleConfig {

    @Bean
    public RouteLocator googleRouteConfig(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/")
                .uri("https://google.com")
                .id("google"))
                .route(r -> r.path("/search")
                .uri("https://google.com")
                .id("google_search"))
                .build();
    }
}
