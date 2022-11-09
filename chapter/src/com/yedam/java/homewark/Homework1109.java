package com.yedam.java.homewark;

import java.util.Scanner;

public class Homework1109 {
	public static void main(String[] args) {
		// 주어진 배열을 이용하여 다음 내용을 구현하세요.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };

		// 문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 60) {
				System.out.println("값이 60인 인덱스 : " + i);
			}
		}

		// 문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		for (int i = 0; i < arr1.length; i++) {
			if (i == 3)
				continue;
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		// 문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
		// 입력) 인덱스: 3 -> {10, 20, 30, 1000, 3, 60, -3}
		Scanner sc = new Scanner(System.in);

		System.out.println("변경하고 싶은 인덱스> ");
		int indexNum = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < arr1.length; i++) {
			if (i == indexNum) {
				arr1[i] = 1000;
			}
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		// 문제4. 주어진 배열의 요소에서 최대값과 최소값을 구해보자.
		int max = arr1[0];
		int min = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			if (max < arr1[i]) {
				max = arr1[i];
			}
			if (min > arr1[i]) {
				min = arr1[i];
			}
		}
		System.out.printf("arr1의 최대값: %d, 최소값: %d\n", max, min);

		// 문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
		int[] arr = new int[10];
		System.out.println("양의 정수 10개를 입력하세요.");
		
		//정수 입력 후 배열에 저장
     	for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]의 수 입력 : ");
			int num = Integer.parseInt(sc.nextLine());
		    arr[i] = num;
		}
		
     	//3의 배수출력
		System.out.print("3의 배수는: ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%3 == 0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		
	}
}
