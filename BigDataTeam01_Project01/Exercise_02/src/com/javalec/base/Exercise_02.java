package com.javalec.base;

public class Exercise_02 {
	
	public static void main(String[] args) {
		// 10의 0제곱 ~ 10의10제곱 까지의 제곱승을 구하라.

		int a = 10;
		long tot = 1;
		for(int i=0; i<=10; i++) {	
			System.out.println("10^" + String.format("%2d",i) +  " =" + String.format("%12d",tot) );
			tot *= a;
		}
		
		
	}


}
