package com.yedam.java.ch;

public class Ch04Test {
	public static void main(String[] args) {
		boolean result = false;
		for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					result = true;
					break;  // if문이 속한 for문만 해당
				}
			}
			System.out.println(" 1) 안쪽 for문 종료");
			if(result) break;  // 굳이 이렇게 사용 ㄴ
		}
		System.out.println(" 2) 바깥쪽 for문 종료");
		
		
		System.out.println("------------------------------");
		
		
		Outter:for(char upper = 'A'; upper <= 'Z'; upper++) {   // 해당 for문에 이름.
			for(char lower = 'a'; lower <='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter;   // 이름 붙여서 종료
				}
			}
			System.out.println(" 1) 안쪽 for문 종료");
		}
		System.out.println(" 2) 바깥쪽 for문 종료");
		
	}
}
