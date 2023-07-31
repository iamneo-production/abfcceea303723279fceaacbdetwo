package com.example.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringappApplication.class, args);

		int count = 1;
        while (count <= 100) {
            System.out.println("Number: " + count);
            count++;
        }

		count = 1;
        while (count <= 100) {
            System.out.println("Number: " + count);
            count++;
        }

		count = 1;
        while (count <= 100) {
            System.out.println("Number: " + count);
            count++;
        }

		count = 1;
        while (count <= 100) {
            System.out.println("Number: " + count);
            count++;
        }
	}

}
