package com.javalec.base;

import java.util.Scanner;

public class quiz_MaxvalueNPosition {
	
	public static void main(String[] args) {
		
		/*
		 * Description:  입력개수 결정후 최대값의 위치와 최대값 
		 * Author: ForrestDPark
		 * Date: 2023.12.1 
		 */
		
		// Properties
		Scanner scanner = new Scanner(System.in);
		int inputNum = 0;


		
		// Input 
		System.out.print("입력할 숫자의 갯수 ? (100개 미만) : ");
		inputNum = scanner.nextInt();
		
		System.out.println(String.format("%d개의 숫자를 입력하세요! ",inputNum));
		
		int maxNum =Integer.MIN_VALUE;
		int minNum =Integer.MAX_VALUE;
		int maxCount = 0;
		int minCount =0;
		int count = 0;
		// Process
		for( int i =0 ; i< inputNum; i++) {
			int iNum=scanner.nextInt();
			
			count ++;
			if(iNum > maxNum) {
				maxNum=iNum;
				maxCount=count;
				
			}
			if(iNum < minNum) {
				minNum =iNum;
				minCount = count;
				
			}
			
			
			//System.out.println(i);
			 
		}
		
		
		// Output
		System.out.println(String.format("입력한 숫자중 최대값은 %d이고 %d번째 값 입니다. ",maxNum,maxCount));
		
	}
}


