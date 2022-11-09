package com.yedam.java.ch;

import java.util.Scanner;

public class Exam1108 {
	public static void main(String[] args) {
		// 1. 주사위 크기 : 5-10 입력받고 범위 벗어나면 안내문
		// 2.주사위 굴리기 : 5가 나올때 까지 굴리고, 몇번째에 5가 나왔는지 표시
		// 3.결과 보기 : 주사위 숫자마다 나온 횟수
		// 4.가장 많이 나온 수 : 가장 많이 나온 수(중복시 작은 수)
		// 5.종료
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		int size = 0;
		int[] dice = null;
		
		while(run) {
			System.out.println("==1.주사위 크기 2.주사위 굴리기 3.결과 보기 4.가장 많이 나온 수 5.종료==");
			System.out.println("메뉴 > ");
			int select = Integer.parseInt(sc.nextLine());
			
			if(select == 1) {
				//주사위 크기
				System.out.println("주사위 크기 > ");
				size = Integer.parseInt(sc.nextLine());
				if(10>=size && size >=5) {
				     dice = new int[size];
				}else {
					System.out.println("5~10사이로 입력해 주세요.");
				}
			}else if(select ==2) {
				//주사위 굴리기
				int count = 0;
				while(true) {
					int diceNm = (int)(Math.random()*size)+1;
					dice[diceNm-1]+= 1; //입력된 값을 배열안에 넣는것이 아니라. 몇번 입력된건지 알기 위해 입력된 수와 같은 순번(인덱스방 = 순번-1)에 +1값을 주는것
					count++;
					if(diceNm == 5) break;
				}
				System.out.printf("%d번째 주사위에 5가 나왔습니다.\n", count);
			}else if(select ==3) {
				//결과 보기
				for(int i=0; i<dice.length; i++) {
					System.out.printf("%d의 숫자가 %d번 나왔습니다.\n", (i+1), dice[i]);
				}
			}else if(select ==4) {
				//가장 많이 나온 수
				int max = dice[0]; // 최대값이 바로 많이 중복되어서 많이 +된 인덱스 값임.
				int index = 0;
				for(int i=0; i<dice.length; i++) {
					if(max < dice[i]) {
						max = dice[i];
						index = i;
					}
				}
				System.out.printf("가장 많이 나온 값은 %d입니다.\n", (index+1) ); //배열의 순번(길이)으로 주사위 값 중복체크 했음.
			}else if(select ==5) {
				//종료
				run = false;
			}else {
				//안내문
				System.out.println("메뉴를 다시 확인하고 입력하세요.");
			}
		}
	    System.out.println("프로그램 종료");
	}
}
