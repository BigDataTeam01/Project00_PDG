package com.javalec.base;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		// 10개의 점수를 (0~99점 까지)입력 받아 점수 분포를 10점 간격의 등급으로 된 히스토그램을 표시하라
		
		// 변수 선언
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int[] person = new int[10];
		
		//입력
		
		System.out.println("Input score : ");
			for(int i = 0; i < person.length; i++) {  
				System.out.print((i + 1) + "의 score : ");  
				 // 입력한 숫자의 배열값을 증가시킴
				score = sc.nextInt();
				person[score/10]++; 
			}
			sc.close();
		//처리	
			System.out.println("---------Histogram---------");   // 히스토그램 출력
			for(int i = (person.length - 1); i >= 0; i--) { // 시작 점수를 출력
				System.out.print(String.format("%3d : ", i*10)); 
				for(int j = 1; j <= person[i]; j++) {// 입력 받은 점수에 횟수에 따라 '#'을 출력하여 히스토그램을 에 찍음
			
		// 출력			
					System.out.print("#");
				}
				System.out.println();
			}
		}

}