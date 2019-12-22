package com.shsxt.crm.config;

import com.shsxt.crm.interceptors.NoAccessInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Administrator on 2019/12/22.
 */
@Configuration
public class ConfigInterceptor extends WebMvcConfigurerAdapter {
    @Bean
    public NoAccessInterceptor noAccessInterceptor(){
      return new NoAccessInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(noAccessInterceptor()).addPathPatterns("/**").excludePathPatterns("/index","/user/login","/static/**");
    }
}
