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

	public void m3() {
		System.out.println("this is m3");
	}
	public void m4() {
		System.out.println("this is m4");
	}
	
	public void m5()
	{
		System.out.println("this is m5");
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
		
	}

}
