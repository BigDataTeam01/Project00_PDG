package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 
//		Scanner scanner = new Scanner(System.in);
		
		String 	str0 	= "가나다라마바"; // String <- 객체형 변수
		String 	str1 	= new String("abcdefg"); // 원래 이렇게 사용하지만, 많이 사용하기에 위에처럼도 사용가능하게 만듦
		String 	str11 	= new String("ABCDEFG"); 
		String 	str2 	= new String("HIJKLMN"); 
		String 	str3 	= new String("   abc   "); 
		
		System.out.println(str1);
		System.out.println(str1.concat(str2).concat(str3).concat(str0)); // 문자열 이어붙여서 출력
		System.out.println(str1.substring(3)); // 3이상 -> defg
		System.out.println(str1.substring(3, 5)); // 3이상 5미만 -> de
		System.out.println(str0.substring(3,5)); // "라마" 만 출력
		
		
		System.out.println(str1.length()); // 문자열의 갯수를 출력 
		System.out.println(str1.toUpperCase()); // 문자열을 대문자로만 출력 
		System.out.println(str2.toLowerCase()); // 문자열을 소문자로만 출력 
		
		System.out.println(str1.charAt(3)); // 내가 원하는 Index의 문자열만 출력 abc'd'efg
		System.out.println(str1.indexOf('d')); // 내가 찾고자 하는 문자열의 Index 번호 
		System.out.println(str1.equals(str2)); // str1 과 equals 안에 있는 str1 을 비교 후 참 or 거짓을 출력
		
		System.out.println(str1.equals(str11.toLowerCase())); //str1과 str11을 eqauls로 비교해서 true 값이 나오게 만들기!
		
		
		System.out.println(str3);
		System.out.println(str3.trim()); // 문자열의 공백을 전부 제거 후 출력
		System.out.println(str1.replace('a',' '));
		System.out.println(str1.replaceAll("abc", "zzzzzzzzz"));
	}

}
