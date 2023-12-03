package com.javalec.base;

import java.util.Scanner;

public class Exercise_07{
	public static void main(String[] args) {
		
		// 숫자 삼각형에 프로그램 작성
		
		// Properties
		Scanner scanner = new Scanner(System.in);
		int step;			// 단계를 표시하기 위한 변수
		int number = 1;		// 숫자를 표시하기 위한 변수
		
		// Input
		System.out.print("몇 단계의 파라미드로 구성할까 ? : ");
		step = scanner.nextInt();	// 단계는 입력한 숫자로 출력
		
		for(int i = 1; i <= step; i++) {		// 세로열 출력을 위한 반복문
			for(int j = 1; j <= i; j++) {		// 세로열이 1일때 가로열도 1, 세로열이 2일때 가로열은2....
												// 첫번째 줄은 숫자 하나, 두번째 줄은 숫자 2개, 세번째 줄은 숫자3개가 출력됨
				System.out.print(String.format("%3d", number++));	// 숫자는 1씩 증가하면서 출력
			}
				System.out.println();			// 가로열 for문을 끝낸후 엔터 표시
		}
		
		
	}

}