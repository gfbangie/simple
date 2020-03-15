package com.example.projectJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectJavaApplication {
	public int add( int a, int b){
		return a+b;
	}

	public int sub( int a, int b){
		return a-b;
	}
	public int mult( int a, int b){
		return a*b;
	}
	public int div( int a, int b){
		return a/b;
	}
	public static void main(String[] args) {
		SpringApplication.run(ProjectJavaApplication.class, args);
		System.out.println("hello");
	}

}
