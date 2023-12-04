package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 입력한 숫자를 가로로 구구단 출력하기 
		// 변수 선언
		int num = 0;
		
		
		Scanner sc = new Scanner(System.in);  //  숫자를 입력 받으려면 스캐너 필요

		// 입력  
		System.out.print(" Input your number : "); //  입력 요청
		num = sc.nextInt();		// 입력 받은 숫자를 변수에 저장 	
		
		
		
		
		
		// 처리
			for(int i = 1; i <= 9; i++) { // 1~9 까지 반복 출력 함
				for(int j = num; j < (num+4); j++) { // 구구단을 출력을 할때 입력받은 숫자의 +4 를 출력하게 해주는 반복문
		
					
		// 출력 
					
					
				System.out.print( j + " X " + i + " = " + String.format("%2d", j*i )+ "\t");
			}
			System.out.println();
				
			
		}
		
		
		
		
	}

}
