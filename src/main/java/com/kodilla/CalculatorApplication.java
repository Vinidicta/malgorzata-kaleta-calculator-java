package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);

		Calculator calculator = new Calculator(2, 3, 6, 3);

		double resultAdd = calculator.add();
		double resultSubtract = calculator.subtract();

		System.out.println(resultAdd);
		System.out.println(resultSubtract);
	}
}

