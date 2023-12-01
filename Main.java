package com.javalec.base;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// 숫자 삼각형에 프로그램 작성
		   
		Scanner scanner = new Scanner(System.in);
		int x;
		int z = 1;
		
		System.out.print("몇 단계의 파라미드로 구성할까 ? : ");
		x = scanner.nextInt();
		
		for(int i = 1; i <= x; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(String.format("%3d", z++));
			}
				System.out.println();
		}
		
		
	}

}
