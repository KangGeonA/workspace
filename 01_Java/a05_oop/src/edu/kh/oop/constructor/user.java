package edu.kh.oop.constructor;

public class user {
	
	//필드
	private String name;
	private int age;
	private String address;
	
	// 생성자가 작성되지 않을 경우
	// -> 컴파일러가 기본 생성자를 추가해줌
	
	 public user(){}  //기본 생성자를 명시적으로 작성
	
	//매개변수 생성자
	// -> 개발자가 생성자를 임의로 하나 이상 작성하면
	//    컴파일러가 자동으로 기본생성자를 추가하지 않는다!
	public user(String name) {
		
		// this 참조 변수
		// - 현재 객체(인스턴스)의 시작 주소를 저장하고 있는 참조변수
		// - 객체(인스턴스) 생성 시 자동으로 내부에 추가됨
		
		this.name = name;
		// 현재 객체의 name 필드에 전달받은 name 값을 저장
		
	}

	public void ex1() {
		
	}
	
	public void ex1(String name) {
		
	}
	
	public void ex1(int age) {
		
	}
	
	//오버로딩(overLoading)
	// - 한 클래스 내부에
	// 동일한 이름의 메서드, 생성자를 여러 개 작성하는 기법
	
	// -> 메서드, 생성자 이름은 하나인데
	// 매개변수의 차이에 따라서 알맞는 메서드, 생성자가 수행됨
	
	// * 오버로딩 성립 조건 *
	// 1. 메서드, 생성자 이름이 같아야 한다!!!
	// 2. 매개변수의 개수, 순서, 타입 중 하나라도 달라야 한다.
	// 3. 접근제한자느 상관 없음
	
	// 매개변수 생성자
	public user(String name, int age) { //매개변수 개수가 다름
		this.name = name;
		this.age = age;
		
	}
	
	public user(int age, String name) { //순서가 다름
		this.name = name;
		this.age = age;
	}
	
	public user(String address, String name) { //타입(자료형) 다름
		this.name = name;
		this.address = address;
	}
	
//	public user(String name, String address) {
		//매개변수의 순서를 바꿔도
		//자료형 순서가 그대로면 오버로딩 성립x
		// ** 변수명보다 자료형을 중요 시 생각해야된다!! **
		//   (제발 변수명에 목숨걸지마요...)
//	}
	
	public user(String name, int age, String address) {
		
	}
	
	
	
	
}
