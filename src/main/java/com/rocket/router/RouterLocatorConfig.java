package com.rocket.router;

import com.rocket.router.properties.ProjectProperties;
import com.rocket.router.properties.MemberProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class RouterLocatorConfig {
    private final MemberProperties memberProperties;
    private final ProjectProperties projectProperties;

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("member-api", r -> r.path("/member/**")
                        .uri("http://" + memberProperties.getHost() + ":" + memberProperties.getPort() + "/"))
                .route("project-api", r -> r.path("/project/**")
                        .uri("http://" + projectProperties.getHost() + ":" + projectProperties.getPort() + "/"))
                .build();
    }
}