package com.techprudent.springbootrestcrud;

import com.techprudent.springbootrestcrud.model.Transacts;
import com.techprudent.springbootrestcrud.repository.TransactsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringBootRestCrudApplication {

	@Autowired
	private static TransactsRepository transactsRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestCrudApplication.class, args);
	}
}
