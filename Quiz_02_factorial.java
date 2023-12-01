package com.javalec.base;

import java.util.Scanner;

public class Quiz_02_factorial {
	
	
	
	
	public static void main(String[] args) {
		
		
		/*
		 * Description : factorial 
		 * Author  : ForrestDPark
		 * Date : 2023.11.30
		 * 
		 */
		
		// Properties
		
		int inputNum = 0;
		int factorial = 1;
		
		// Input
		
		System.out.print("Input your decimal no. : ");
		Scanner scanner = new Scanner(System.in);
		inputNum = scanner.nextInt();
		
		// Process
		for(int fi=1 ; fi < inputNum ; fi++) {			
			factorial *= fi+1 ;
		}
		
		
		// Output
		System.out.println(inputNum +"'s factorial value =  "+ factorial);
		

		
	}

}
