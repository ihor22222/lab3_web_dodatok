package com.webspring.lab3;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@PropertySource("classpath:application.properties")
@Configuration
@ComponentScan(basePackages = "com.webspring.lab3")
@EnableAspectJAutoProxy
public class AppConfig {

}

