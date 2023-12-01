package com.javalec.base;

import java.util.Scanner;

public class Quiz_07 {

	public static void main(String[] args) {
		// 몇 개의 숫자를 입력할지 결정한 후 숫자를 입력하고 이중 최대값의 위치와 최대값을 구하여라
		
		Scanner scanner = new Scanner(System.in);
		

		System.out.print("입력할 숫자의 갯수? ( 100개 미만) :");
		int[] num = new int[scanner.nextInt()];
		
		
		System.out.println(num.length + "의 숫자를 입력하세요 :");
		for(int i =0; i<num.length; i++) {
			num[i] = scanner.nextInt();
		}
		
		int max = num[0];     // 변수로 지정후 최대값 비교 출력
		int pos = 0;   // Position 변수 값 지정
		
		for(int i=0; i<num.length; i++) {
			if(num[i]> max) {
				max = num[i];
				pos = i;
			}
		}
		System.out.println("입력한 숫자중 큰 숫자는"+ max + "이며 위치는 "+ (pos+1) + "이다.");
		
	}

}
