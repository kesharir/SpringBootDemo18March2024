package com.in28minutes.rest.webservices.restfulwebservices.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        /**
         *
         *   - All requests should be authenticated
         *   - If the request is not authentiated, a web page is shown.
         *   - CSRF Check introduced as part of filter chain -> POST, PUT
         */

        // All requests should be authenticated
        http.authorizeHttpRequests(
            auth -> auth.anyRequest().authenticated()
        );

        // If the request is not authentiated, a web page is shown.
        http.httpBasic(Customizer.withDefaults());
        // SRF Check introduced as part of filter chain -> POST, PUT
//        CsrfConfigurer<HttpSecurity> csrfConfigurer = HttpSecurity.RequestMatcherConfigurer.
//        http.csrf().disable();

        return http.build();
    }
}
