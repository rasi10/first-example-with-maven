package com.kvalit18.example.first_example_with_maven;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

public class CalculatorTest {
	Calculator calculator = new Calculator();
	
	
	@Test
	public void testAddition10Times() {
		double oracle = 0.0;
		double randomNumber1 = 0.0;
		double randomNumber2 = 0.0;
		Random random = new Random();
		for (int i = 0; i < 100000; i++) {
			randomNumber1 = random.nextDouble() * 10;
			randomNumber2 = random.nextDouble() * 10;			
			//Calculating the addition "by hand".
			oracle = randomNumber1 + randomNumber2;			
			assertEquals(calculator.addition(randomNumber1,randomNumber2),oracle,0);
			System.out.println("Testing add method with: "+randomNumber1+ 
					" and "+ randomNumber2+ " = "+ oracle);
		}		
	}
	

}
