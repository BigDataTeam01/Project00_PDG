package com.javalec.base;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random random = new Random();
		
//		for(int loop = 1; loop <= 10; loop++) {
//			int i = random.nextInt(10);			// 0부터 10까지의 변수중에 하나
//			System.out.println(i);
//		}
		
		

		
		
		// Lotto 번호 생성기
		
		long startTime1 = System.currentTimeMillis();
		int[] lotto;
		lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			for(int j = i-1; j >= 0; j--) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			lotto[i] = random.nextInt(1, 46);
		}
		for(int i = 0; i < 6; i++) {
			System.out.println((lotto[i]));
		}
		
		long endTime1 = System.currentTimeMillis();
		System.out.println("Term2 : " + (endTime1 - startTime1));	// 12 밀리세컨드
//		// Properties
//		int lotto;
//		int[] lottoNum;
//		lottoNum = new int [45];
//		
//		// Process
//		for(int i = 0; i < 6; i++) {
//			lotto = random.nextInt(1, 46);
//			if(lottoNum[lotto] == 0) {
//				lottoNum[lotto] = lotto;
//			}else {
//				i--;
//				continue;
//			}
//		}
//		
//		// Output
//		for(int i = 0; i < 45; i++) {
//			if(lottoNum[i] != 0) {
//				System.out.println(lottoNum[i]);
//			}
//		}
		
	}

}
