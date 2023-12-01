package com.javalec.base;

import java.util.Scanner;

public class Exercise_05 {

	public static void main(String[] args) {
		// 숫자를 입력받아 입력받은 숫자 중 한 자릿수 정수의 합을 구하는 프로그램
		
		
		// 변수 선언
		Scanner sc = new Scanner(System.in); // 2. 숫자를 입력받아야 하기 때문에 Scanner 필요
		long num = 0;
		long sum = 0;
		
		
		// 입력
		System.out.print("Enter an integer(0 ~ 9) : "); // 1. 숫자를 입력받기 위해 사용자에게 입력을 요청
		num = sc.nextLong(); // 3. 입력받은 숫자를 변수에 저장
		
		
		// 처리 
		while( num != 0 ) { // 6. 계속 나누면서 버리다 보면 어느순간 1의자리 숫자만 남게되고, 마지막으로 남은 1의자리 숫자를 While문을 통해 처리되면, 입력받은숫자는 0이 되고 While문 탈출
			sum +=  num % 10; // 4. 입력 받은 숫자를 10으로 나눈 후 나머지값을 변수에 저장 -> 입력받은 수의 1의자리 숫자를 누적하여 더함
			num /= 10; // 5. 입력 받은 숫자를 10으로 나누어 누적 합이 처리된 1의자리 숫자를 int형 나눗셈으로 버림 ->  10의 자리 숫자가 1의자리 숫자로 Shift, 100의 자리 숫자가 10의 자리 숫자로 Shift ...
		}
		
		
		// 출력 
		System.out.println("Sum of digits = " + sum); // 7. While문을 통해 처리한 각 자리수의 합을 출력
		
		
	}	
}
