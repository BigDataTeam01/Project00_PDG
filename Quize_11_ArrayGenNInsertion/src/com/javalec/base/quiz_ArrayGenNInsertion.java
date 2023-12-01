package com.javalec.base;

import java.util.Scanner;

public class quiz_ArrayGenNInsertion {
	
	
	
	public static void main(String[] args) {
		
		/*
		 * Description:  입력과 삽입 
		 * Author: ForrestDPark
		 * Date: 2023.12.1 
		 */
		
		// Properties
		Scanner scanner = new Scanner(System.in); 
		
		int inputNum = 0;
		int insertPoso = 0 ;
		int insertNum = 0 ;
		
		
		
		
		
		

		// Input 
		
		System.out.print("입력할 숫자의 개수 ?  :");
		inputNum = scanner.nextInt();
		int []numArray = new int[inputNum];
		System.out.println(String.format("d개 의 숫자를 입력하세요! :", inputNum));
		for(int i = 0; i<inputNum;  i++) {
			System.out.print(String.format("%d의 숫자 :",i+1));
			numArray[i] = scanner.nextInt();
		}
		System.out.println("삽입하고자 하는 위치는 ? : ");
		insertPoso =scanner.nextInt();
		System.out.println("삽입하고자 하는 수는 ? : ");
		insertNum =scanner.nextInt();
		
		
		
		int count =0;
		int [] resultArray =new int[inputNum+1];
		// Process
		for(int i=0; i <numArray.length; i++) {  
			
			 
			if(insertPoso-1==count) {
				resultArray[i]= insertNum;
				count+=1;
				//System.out.println("asdf"+count);
				
				
			}
			resultArray[count]= numArray[i];
			count++;
			

		}
		
			
		
				

		
		// Output
		System.out.println("------------결과 ----------------");
		for(int i=0 ; i<resultArray.length; i++) {
			System.out.println(resultArray[i]);
		}

	}
			
}


