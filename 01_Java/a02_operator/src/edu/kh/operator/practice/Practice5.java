package edu.kh.operator.practice;

import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int input1 = sc.nextInt();
		
		System.out.print("영어 : ");
		int input2 = sc.nextInt();
		
		System.out.print("수학 : ");
		int input3 = sc.nextInt();
		
		int result1 = (input1 + input2 + input3);
		double result2 = result1 / 3;
		
		String result3 = result2 >= 60 ? "합격" : 
			input1 >= 40 ? "합격" :
		input2 >= 40 ? "합격" :
		input3 >= 40 ? "합격" : "불합격";
		
		
		System.out.println("합계 : " + result1);
		System.out.println("평균 : " + result2);
		System.out.println(result3);
	}
}
