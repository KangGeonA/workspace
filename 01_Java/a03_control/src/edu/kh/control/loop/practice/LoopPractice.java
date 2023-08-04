package edu.kh.control.loop.practice;

import java.util.Scanner;

public final class LoopPractice {

	public void practice6() {
		
		//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		//단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
	  //if( !(input >= 2 && input <= 9)) { // 2~9 사이가 아닐 경우
		if( !(input < 2 || input > 9)) { // 2~9 사이가 아닐 경우
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		} else {
			
			for(int dan=2 ; dan<=9 ; dan++) {
				System.out.printf("===== %d단 ===== \n",dan);

				for(int i=1 ; 1<=9 ; i++) {
					System.out.printf("%d x %d = %d \n", dan, i ,dan*i);
				}
			}
		}
	}
	
	
	
	
	
	
	
}
