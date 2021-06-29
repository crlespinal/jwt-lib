package com.bankunited.jwtlib.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.bankunited.jwtlib")
@PropertySource(value = "classpath:jwt-lib.yml", factory = YamlPropertySourceFactory.class)
public class JwtLibConfig {
    
}
