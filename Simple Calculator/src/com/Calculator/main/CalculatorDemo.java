/**
 * 
 */
package com.Calculator.main;

import java.util.Scanner;

import com.Calculator.Calculation.Calculation;

/**
 * @author Karan
 *
 */
public class CalculatorDemo {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculation calculate = new Calculation();
		
		int ch;
		double input1, input2;
		
		Scanner scan = new Scanner(System.in);
		Scanner sc= new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("\t\t\t\t------------BASIC CALCULATOR------------\n\n");
		
		System.out.println("Enter the First number");
		input1=scan.nextDouble();
		
		System.out.println("Enter the second number");
		input2=sc.nextDouble();
		
		
		System.out.println("1:Addition\n\n2:Subtraction\n\n3:Multiplication\n\n4:Division");
		
		System.out.println("Enter your choice---------\n");
		
		ch=sc1.nextInt();
				
			
		switch(ch) {
		
		case 1:
			calculate.doAddition(input1, input2);
			break;
		case 2:
			calculate.doSubtraction(input2, input2);
			break;
		case 3:
			calculate.doMultiplication(input2, input2);
			break;
		case 4:
			calculate.doDivision(input2, input2);
			break;
			default:
				System.out.println("Not a valid option");
				System.exit(0);
		
		}
		
		
		
		
		

	}

}
