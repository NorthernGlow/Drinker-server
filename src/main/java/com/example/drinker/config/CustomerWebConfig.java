package com.example.drinker.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

@EnableWebMvc
@Configuration
public class CustomerWebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String path = "file:///" + System.getProperty("user.home") + File.separator + "IdeaProjects" + File.separator + "Drinker" + File.separator + "src" + File.separator + "photo" + File.separator;
        registry
                .addResourceHandler("photo/**")
                .addResourceLocations(path);
    }
}
