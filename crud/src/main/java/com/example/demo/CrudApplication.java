package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {
	
	public void m1()
	{
		System.out.println("this is m1");
	}
	public void m2() {
		System.out.println("this is m2");
	}

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

}
