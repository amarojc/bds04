package com.devsuperior.bds04.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

@Configuration
public class AppConfig {

	@Value("${jwt.secret}")
	private String jwtSecret;
	
	@Bean
	JwtAccessTokenConverter accessTokenConveter() {
		JwtAccessTokenConverter tokenConverter = new JwtAccessTokenConverter();
		tokenConverter.setSigningKey(jwtSecret);
		
		return tokenConverter;
	}
}
