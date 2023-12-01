package com.javalec.base;

import java.util.Scanner;

public class quiz_GradeHistogram {
	
	
	
	public static void main(String[] args) {
		
		/*
		 * Description:  4명의 성적을 입력받고 각 학생의 평균과 합을 구하여 테이블에 출력  
		 * Author: ForrestDPark
		 * Date: 2023.12.1 
		 */
		
		// Properties
		Scanner scanner = new Scanner(System.in); 
		

		int [] scores_numbers ={0,0,0,0,0,0,0,0,0,0};
		int [] scores = {0,10,20,30,40,50,60,70,80,90};
		
		
		int [] studentArray = new int[10];
		
		
		
		int inputNum =0;

		// Input 
		
		System.out.println("Input score :");
			
			
			
		// Process
		for(int i=0; i < studentArray.length; i++) {  

			System.out.print(String.format("%d 의 score :", i+1));
			studentArray[i] = scanner.nextInt();
			
		
			switch(studentArray[i]/10) {

					case 9:scores_numbers[9]++;break;
					case 8:scores_numbers[8]++;break;
					case 7:scores_numbers[7]++;break;
					case 6:scores_numbers[6]++;break;
					case 5:scores_numbers[5]++;break;
					case 4:scores_numbers[4]++;break;
					case 3:scores_numbers[3]++;break;
					case 2:scores_numbers[2]++;break;
					case 1:scores_numbers[1]++;break;
					case 0:scores_numbers[0]++;break;
				}
			
			
		}
			
		
				
		String result ="";
		
		// Output
		System.out.println("------------Histogram----------------");
		for(int si = 0; si < scores_numbers.length  ; si++) {
			System.out.print(String.format("%2d : ", scores[9-si]));
			for(int j =0; j<scores_numbers[9-si]; j++) {
				result +="#";
				
				
			}
			
			System.out.println(result);
			result ="";
			
		}

	}
			
}


