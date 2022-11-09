package com.yedam.java.ch;

import java.util.Scanner;

public class Ch05Test {
	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		int studentNum = 0;
		int[] scores = null;
		
		while(run) {
			System.out.println("===================================");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.점수분석 5.종료");
			System.out.println("===================================");
			System.out.println("선택> ");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch(selectNo) {
			case 1:
				//학생 수
				System.out.println("학생수> ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
				break;
			case 2:
				//점수입력
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]> \n", i);
					int score = Integer.parseInt(sc.nextLine());
					scores[i] = score;
				}
				break;
			case 3:
				//점수리스트
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d] : %d\n", i, scores[i]);
				}
				break;
			case 4:
				//점수분석
				int max = scores[0];
				int sum = 0;
				for(int i=0; i<scores.length; i++) {
					if(max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				double avg = (double)sum / scores.length;
				System.out.printf("최고점수는 %d점이고, 평균은 %.2f점입니다.\n", max, avg);
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("메뉴를 정확히 입력하세요.");
			}
		}
		System.out.println("프로그램 종료");
	}
}
