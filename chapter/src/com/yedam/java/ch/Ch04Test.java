package com.yedam.java.ch;

public class Ch04Test {
	public static void main(String[] args) {
		/*
		 * *
		 ***
		 ***** 
		 */

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (j <= (4 - i)) {
					System.out.print(" ");
				} else if(j > (4-i)) {
					System.out.print("*");
				} 
				if (j < i) {
					System.out.print("*");
				}

			}
			System.out.println();   //주말에 한번 더 생각. 해보기
		}
	}
}
