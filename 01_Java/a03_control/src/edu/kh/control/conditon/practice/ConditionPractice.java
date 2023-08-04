package edu.kh.control.conditon.practice;

import java.util.Scanner;

public class ConditionPractice {

	// 실습문제 1
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num1 = sc.nextInt();
		
		String result;
	    if(num1 <= 0) {
		result = "양수만 입력해주세요.";
	    } else if(num1 % 2 == 0) {
			result = "짝수입니다.";
		} else {
			result = "홀수입니다.";
		}
		System.out.println(result);
	}
	
	// 실습문제 2
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int a = kor + math + eng;
		double b = a / 3.0; //a(정수)에서 3.0을 나눠야 3.3
		
		if(kor >= 40 && math >= 40 && eng >= 40 && b >= 60) {
			System.out.printf("국어 : %d \n",kor);
			System.out.printf("수학 : %d \n", math);
			System.out.printf("영어 : %d \n", eng);
			System.out.printf("합계 : %d \n", a);
			System.out.printf("평균 : %.1f \n", b);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	// 실습문제 3
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int mon = sc.nextInt();
		int day;
		
		switch(mon) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : day = 31; break;
		case 4 : case 6 : case 9 : case 11 : day = 30; break;
		case 2 : day = 28; break;
		default : day = 0;
		}
		
		if(day == 0) {
			System.out.printf("%d월은 잘못 입력된 달입니다.",mon);
		} else {
		System.out.printf("%d월은 %d일까지 있습니다.", mon, day);
		}
	}
	
	// 실습문제 4
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double m = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();
		
		double bmi = kg / (m * m);
		
		if(bmi >= 30) {
			System.out.println("고도 비만");
		} else if(bmi < 30 && bmi >= 25) {
			System.out.println("비만");
		} else if(bmi < 25 && bmi >= 23) {
			System.out.println("과체중");
		} else if(bmi < 23 && bmi >= 18.5) {
			System.out.println("정상체중");
		} else {
			System.out.println("저체중");
		}
		
	}
	
	// 실습문제 5
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수");
		int mi = sc.nextInt();
		System.out.print("기말 고사 점수");
		int fi = sc.nextInt();
		System.out.print("과제 점수");
		int ho= sc.nextInt();
		System.out.print("출석 횟수");
		int at = sc.nextInt();
		
		System.out.println("===========결과================");
		
		//출석 횟수가 부족한 경우 (14회 이하)
		if(at <= 20 * (1 - 0.3)) {
			System.out.println("");
		} else { //출석은 잘했을 떄
			// 점수환산
			double mis = mi * 0.2;
			double fis = fi * 0.3;
			double hos = ho * 0.3;
			double ats = at * 5 * 0.2; // == attendance
			
			//총점
			double sum = mis + fis + hos + ats;
			
			System.out.println("중간 고사 점수(20) : " + mis);
			System.out.println("기말 고사 점수(30) : " + fis);
			System.out.println("과제 점수(30) : " + hos);
			System.out.println("출석 점수(20) : " + ats);
			System.out.println("총점 " + sum);
			
			if(sum >=70) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail [점수 미달]");
			}
			
		}

	}
	
}
