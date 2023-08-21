package com.rocket.router.properties;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MemberProperties.class)
public class MemberAutoConfig {
}
