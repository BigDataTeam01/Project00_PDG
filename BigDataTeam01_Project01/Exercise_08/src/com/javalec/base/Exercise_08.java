package com.javalec.base;

import java.util.Scanner;

public class Exercise_08 {
	
	public static void main(String[] args) {
		
		/*
		 * Description:  입력개수 결정후 최대값의 위치와 최대값 
		 * Author: ForrestDPark
		 * Date: 2023.12.1 
		 */
		
		// Properties
		Scanner scanner = new Scanner(System.in);
		int inputNum = 0; 				// 입력할 숫자의 개수 
		int maxNum =Integer.MIN_VALUE; 	// 최대 숫자 
		int maxCount = 0;				// 최대 숫자가 있는 위치 
		int count = 0;

		// Input 
		System.out.print("입력할 숫자의 갯수 ? (100개 미만) : ");
		inputNum = scanner.nextInt();
		System.out.println(String.format("%d개의 숫자를 입력하세요! ",inputNum));
		
		
		// Process
		for( int i =0 ; i< inputNum; i++) {
			int iNum=scanner.nextInt();		// 숫자 입력 
			
			count ++;
			
			if(iNum > maxNum) {				//최대수 찾음  
				maxNum=iNum;
				maxCount=count;
			}
		}
		
		
		// Output
		System.out.println(String.format("입력한 숫자중 최대값은 %d이고 %d번째 값 입니다. ",maxNum,maxCount));
		
	}
}