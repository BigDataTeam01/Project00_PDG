package com.javalec.base;

import java.util.Scanner;

public class Exercise_12 {

	public static void main(String[] args) {
		/*
		 * Description : Reordering 
		 * Author  : j.park
		 * Date : 2023.12.03
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력할 숫자의 갯수? :");
		int inputNum1 = scanner.nextInt(); 						//입력할 숫자의 갯수 입력
		int [] num = new int [(inputNum1*2)];					//배열에 공백 넣기위해 입력수에 *2함
		
		System.out.println(inputNum1 + "숫자를 입력하세요!:");		//숫자입력 출력
		
		for(int i = 0; i <=inputNum1-1 ; i++) {					
			System.out.print(i+1 +"의 숫자 :");					
			 num[i*2] = scanner.nextInt();						// 입력 숫자 입력 (짝수 번째에 입력하기 위해 *2함)
		}
		
		System.out.print("숫자를 삽입하고자 하는 위치는 ? :");
		int inputNum3 = scanner.nextInt();						//배열 위치 입력
		
		System.out.print("삽입하고자 하는 수는 ? :");
		num[inputNum3*2-3] = scanner.nextInt();					// 삽입 숫자 입력 (홀수 번째에 저장하기 위해 삽입 위치에 *2함)

		System.out.println("------- 결과 -------");
		for(int i = 0; i <=inputNum1*2-1 ; i++) {
			if (num[i]!=0) {									//array안에 0 제외하고 입력받은 숫자만 출력
			
			System.out.println(num[i]);							// 어레이 출력
		}
		
		}
		
		
	}

}