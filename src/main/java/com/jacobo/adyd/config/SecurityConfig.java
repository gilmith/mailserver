package com.jacobo.adyd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		http.sessionManagement((session) -> {
			session.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		});
		http.csrf((csrf) -> {
			csrf.disable();
		});
		http.authorizeHttpRequests(
				(authorizeHttpRequests) -> 
						authorizeHttpRequests
						.requestMatchers(HttpMethod.POST, "/mail").permitAll()						
		);
		return http.build();

	}

}
