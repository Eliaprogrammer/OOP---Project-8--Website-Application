//Elia Schwartz, COP 3330C - 33777, July 15, 2025.
/*This program aims to establish a web application for where the user can input
* student id, month, day, year, and message about the date. Display the
* results after clicking the submit button.
 */
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Marks this as the main spring boot application
public class DemoApplication {

	public static void main(String[] args) {

		//Start the Spring Boot Application
		SpringApplication.run(DemoApplication.class, args);
	}
}
