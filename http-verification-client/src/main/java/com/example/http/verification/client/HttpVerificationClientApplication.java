package com.example.http.verification.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.interfaceclients.http.InterfaceClientGroup;

@SpringBootApplication
@InterfaceClientGroup(value = "verificationClient", basePackages = "com.example.http.verification.client.clients")
public class HttpVerificationClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpVerificationClientApplication.class, args);
	}

}

