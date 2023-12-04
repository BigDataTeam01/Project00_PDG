package com.javalec.base;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		
		// Lotto 번호 생성기
		
		int[] result = new int[7];
		int loop = 0;
		int number = 0;
		int a = 0;
		Random selectnum = new Random();
		
		while(true) {
			for(int i=0; i<7; i++) {
				number = selectnum.nextInt(46);
				if(number == 0) {
					i--;
					break;
				}
				
				else {
					result[i] = number;
					for(int j=0; j<i; j++) {
						int count = 0;
						if(result[i] == result[j]) {
							result[i] = 0;
							count ++;
						}
						
						if(count == 1) {
							i--;
							break;
						}
					}
				}
			}
			
			if(result[6] != 0) break;
		}
		
		for(int i=0; i<5; i++) {
			for(int j=i+1; j<6; j++) {
				if(result[i] > result[j]) {
					a = result[i];
					result[i] = result[j];
					result[j] = a;
				}
			}
			
		}

			
		
		System.out.print("금주의 로또번호는 ");
		for(int i=0; i<6; i++) {
			System.out.print(result[i]+",");
			
			if(i==5) System.out.println(" 보너스번호 : " + result[6]);
		}
	}
}

