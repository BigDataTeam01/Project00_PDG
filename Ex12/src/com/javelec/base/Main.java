package com.javelec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//배열의 삽입
		Scanner sc = new Scanner(System.in);
		int count = 0; // 입력갯수 
		int[] number; // 입력 저장 배열
		int position = 0; // 삽입 위치
		int insNum = 0; // 삽입 숫자
		
		System.out.print("입력한 숫자의 갯수 : ");
		count = sc.nextInt();
		number = new int[count + 1];
		
		System.out.println(count + "개의 숫자를 입력하세요 : ");
			
		for(int i = 0; i < count; i++) {
			System.out.print((i + 1) + "의 숫자 : ");
			number[i] = sc.nextInt();
		}
		
		System.out.print("숫자를 삽입하고자 하는 위치는 ? : ");
		position = sc.nextInt();
		
		System.out.print("삽입 하고자 하는 수는 ? : ");
		insNum = sc.nextInt();
		
		//--------- 사용자에게 입력 받는 과정 ----------
		
		
		for(int i = count - 1; i >= position; i--) {
			number[i + 1] = number[i];
		}
		
		number[position - 1] = insNum;
			
		//for test
		System.out.println("--------결과--------");
		for(int i = 0; i < count + 1; i++) {
			System.out.println(String.format("%3d", number[i]));
		}
		
	}

}
