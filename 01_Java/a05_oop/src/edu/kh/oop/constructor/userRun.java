package edu.kh.oop.constructor;

public class userRun {
	public static void main(String[] args) {
		
		//사용자 객체 생성
		user u1 = new user();
		//           -> 기본 생성자
		           // 기봄 생성자를 작성하지 않아도
		           // 컴파일러가 자동으로 추가해주기 때문에 오류 발생 x
		
		// The constructor user() is undefined
		// -> user() 기본생성자가 정의(작성)되지 않았다
		
		//오버 로딩으로 만든 다양한 생성자를 이용해 객체 생성
		user u2 = new user("김고길");
		
		user u3 = new user(50, "박철수");
		
		user u4 = new user("김미영", 30);
		
		user u5 = new user("서울시 금천구", "홍길동");
				
		
		
		System.out.println("종료");
		
		
	}

}
