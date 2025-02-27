package com.example.http.verification.client;

import com.example.http.verification.client.clients.VerificationService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.interfaceclients.http.InterfaceClientGroup;

@SpringBootApplication
@InterfaceClientGroup(value = "verificationClient2", basePackageClasses = VerificationService.class)
@InterfaceClientGroup(value = "verificationClient", httpServiceTypes = VerificationService.class)
public class HttpVerificationClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpVerificationClientApplication.class, args);
	}

}

