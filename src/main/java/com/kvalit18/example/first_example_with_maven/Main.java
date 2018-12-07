package com.kvalit18.example.first_example_with_maven;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		CalculatorBasic cb = new CalculatorBasic();
		System.out.println(cb.addition(2, 2));
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, inform the first value");
		
	}

}
