package com.javalec.base;

import java.util.Scanner;

public class quiz_ArrayGenNInsertion {
	
	
	
	public static void main(String[] args) {
		
		/*
		 * Description:  배열 갯수 입력 및 특정 위치 원소 삽입 
		 * Author: ForrestDPark
		 * Date: 2023.12.1 
		 */
		
		// Properties
		Scanner scanner = new Scanner(System.in); 
		
		int inputNum = 0; 		// 입력받을 숫자의 개수 
		int insertPos = 0 ;		// 삽입을 원하는 위치 
		int insertNum = 0 ;		// 삽입을 원하는 숫자 
		
	
		// Input 
		
		System.out.print("입력할 숫자의 개수 ?  :");
		inputNum = scanner.nextInt();
		int []initialArray = new int[inputNum];			//숫자의 개수 만큼 초기 배열크기 생성 
		
		
		
		System.out.println(String.format("%d개 의 숫자를 입력하세요! :", inputNum));
		
		
		for(int i = 0; i<inputNum;  i++) { 				// 	숫자를 순서대로 입력받음 
			System.out.print(String.format("%d의 숫자 :",	i+1));
			initialArray[i] = scanner.nextInt();
		}
		
		
		
		//삽입 원소의 정보 입력 
		System.out.println("삽입하고자 하는 위치는 ? : ");
		insertPos =scanner.nextInt();	
		System.out.println("삽입하고자 하는 수는 ? : ");
		insertNum =scanner.nextInt();
		
		
		// 삽입된 결과배열 생성 
		int count =0;
		int [] resultArray =new int[inputNum+1]; // 초기 배열보다 개수가 하나 추가된 결과 배열 
		
		
		// Process
		for(int i=0; i < initialArray.length; i++) {  // 초기 배열 개수만큼 반복 
			 
			if(insertPos-1 == count) { 		// 지정 삽입위치에 도달 시 해당 번지에 지정 원소 삽입 
				resultArray[i] = insertNum; //
				count+=1;
			}
			resultArray[count] = initialArray[i];
			count++;
			

		}

		
		// Output
		System.out.println("------------결과 ----------------");
		for(int i=0 ; i<resultArray.length; i++) {
			System.out.println(resultArray[i]);
		}

	}
			
}


