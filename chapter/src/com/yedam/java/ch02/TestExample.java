package com.yedam.java.ch02;

//import java.util.Scanner;

public class TestExample {

	public static void main(String[] args) {
		char v1 = '가';
		int v3 = v1;
		System.out.println(v3);
		
		String job = "프로그래머";
		System.out.println(job.charAt(3));
		
		
		byte x = 10;
		byte y = 20;
		int result2 = x+y;
		byte rseult3 = (byte)(x+y);
		System.out.println(result2 + "," + rseult3);
		
		char charValue = 'A';
		char charValue2 = 1;
		int intResult = charValue + charValue2;
		System.out.println(intResult);
		System.out.println((char)intResult);
		
		int aVar = Integer.parseInt("10");
		double bVar = Double.parseDouble("101.0");
		boolean cVar = Boolean.parseBoolean("true");
		
		System.out.println("a : " + aVar);
		System.out.println("b : " + bVar);
		System.out.println("c : " + cVar);
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		double area = 3.14159*10*10;
		System.out.println(area);
		System.out.printf("반지름이 %d인 원의 넓이: %.2f\n",10,area);
		
//		Scanner sc = new Scanner(System.in);
//		
//		String inputData;
//		while(true) {
//			inputData = sc.nextLine();
//			System.out.printf("입력: %s\n", inputData);
//			if(inputData.equals("exit")) {
//				break;
//			}
//		
//			
//		}
//		System.out.println("종료");
		
		
	
	}

}
