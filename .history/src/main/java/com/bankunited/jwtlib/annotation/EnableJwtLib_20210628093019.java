package com.bankunited.jwtlib.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.bankunited.jwtlib.config.JwtLibConfig;

import org.springframework.context.annotation.Import;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(JwtLibConfig.class)
public @interface EnableJwtLib {
    
}
