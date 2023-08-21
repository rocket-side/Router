package com.rocket.router.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.rest.template.project")
@Getter
@Setter
public class ProjectProperties {
    private String host;
    private String port;
}
