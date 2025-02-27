package com.example.http.verification.client.config;

import com.example.http.verification.client.clients.VerificationService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientHttpServiceProxyRegistry;

/**
 * @author Olga Maciaszek-Sharma
 */
@Configuration
public class UserInterfaceClientsConfig {

	@Bean
	public RestClientHttpServiceProxyRegistry restClientHttpServiceProxyRegistry(RestClient.Builder restClientBuilder) {
		RestClientHttpServiceProxyRegistry proxyRegistry = RestClientHttpServiceProxyRegistry.create(restClientBuilder);
		proxyRegistry.registerGroup("programmaticVerificationClientGroup",
				group -> {
					group.addHttpServiceTypes(VerificationService.class);
					group.baseUrl("http://localhost:8081/");
				});
		return proxyRegistry;
	}
}
