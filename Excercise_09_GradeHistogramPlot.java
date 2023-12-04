package com.javalec.base;

import java.util.Scanner;

public class Excercise_09_GradeHistogramPlot {
	
	
	public static void main(String[] args) {
		
		/*
		 * Description:  4명의 성적을 입력받고 각 학생의 평균과 합을 구하여 테이블에 출력  
		 * Author: ForrestDPark
		 * Date: 2023.12.1 
		 */
		
		// Properties
		Scanner scanner = new Scanner(System.in); 
		
		int [] hist = new int[10];
		int score =0;


		// Input 
		
		System.out.println("Input score :");
			
			
			
		// Process
		for(int mi=0; mi < 10; mi++) {  

			System.out.print(String.format("%2d 의 score :", mi+1));
			score = scanner.nextInt();
			hist[score/10]++;
			
		}
			
		
				
		String result ="";
		
		// Output
		System.out.println("------------Histogram----------------");
		for(int si = 0; si < 10 ; si++) {
			System.out.print(String.format("%2d : ", (9-si)*10));
			for(int j =0; j< hist[9-si]; j++) {
				System.out.println("#");
				
				
			}			
		}
	}
}