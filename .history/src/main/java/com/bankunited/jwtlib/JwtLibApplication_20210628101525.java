package com.bankunited.jwtlib;

import java.util.Date;

import com.bankunited.jwtlib.model.Jwt;
import com.bankunited.jwtlib.repo.JwtRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtLibApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(JwtLibApplication.class, args);
	}

	@Autowired
	JwtRepo repo;

	public void run(String... args) throws Exception {

		Jwt jwt = new Jwt();
		jwt.setCreatedDate(new Date());
		jwt.setJti("123456789");

		this.repo.save(jwt);

		System.out.println("Some");
	}

}
