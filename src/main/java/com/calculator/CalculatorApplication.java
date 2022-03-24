package com.calculator;

import java.util.Scanner;

import com.calculator.models.Operators;

public class CalculatorApplication {

	public static void main(String[] args) {
		startApp();
	}

	public static void startApp() {
		Scanner read = new Scanner(System.in);
		int numOne, numTwo, option;
		
		do {
			System.out.println("Welcome to the calculator app");
			System.out.println("Please, select an option");
			System.out.println("1. Sum");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("5. Exit");
			option = read.nextInt();

			switch (option) {
			case 1:
				System.out.println("Please, enter the first number");
				numOne = read.nextInt();
				System.out.println("Please, enter the second number");
				numTwo = read.nextInt();
				Operators operatorsSum = new Operators(numOne, numTwo);
				operatorsSum.sum();
				break;
			case 2:
				System.out.println("Please, enter the first number");
				numOne = read.nextInt();
				System.out.println("Please, enter the second number");
				numTwo = read.nextInt();
				Operators operatorsSubtract = new Operators(numOne, numTwo);
				operatorsSubtract.subtract();
				break;
			case 3:
				System.out.println("Please, enter the first number");
				numOne = read.nextInt();
				System.out.println("Please, enter the second number");
				numTwo = read.nextInt();
				Operators operatorsMultiply = new Operators(numOne, numTwo);
				operatorsMultiply.multiply();
				break;
			case 4:
				System.out.println("Please, enter the first number");
				numOne = read.nextInt();
				System.out.println("Please, enter the second number");
				numTwo = read.nextInt();
				Operators operatorsDivide = new Operators(numOne, numTwo);
				operatorsDivide.divide();
				break;
			case 5:
				System.out.println("\nThank you for using the calculator app \n");
				break;
			default:
				System.out.println("\nPlease, select a valid option \n");
				break;
			}

		} while (option != 5);
				
	}

}
