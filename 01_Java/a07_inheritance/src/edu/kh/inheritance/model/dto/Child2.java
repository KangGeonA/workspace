package edu.kh.inheritance.model.dto;

//  Parent를 상속 받겠다
// -> Child2가 Parent의 필드, 메서드를 내부에 포함하게되어 자신의 것처럼 사용할수 없다
// -> 



public class Child2 extends Parent{
	private String house;

	// 생성자
	public Child2() {
		super(); // 상속 관계 시 부모 객체가 먼저 생성 되어야 하기 때문에
		        // 자식 생성자 첫 번째 줄에 무조건 작성!
		        // 단, 미작성 시 컴파일러가 추가
		
		System.out.println("Child2() 기본 생성자로 자식 객체 생성");
	}
	
	public Child2(String house) {
		
		this.house = house;
		System.out.println("Chile2(String) 매개변수 생성자로 자식 객체 생성");
	}
	
	public Child2(int money, String lastName, String house) {
		
//		this.money = money;
	//	this.lastName = lastName;
		super(money, lastName);
		this.house = house;
	}
	
	
	
	
	
	
	
	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	@Override
	public String toString() {
		// 부모로 부터 상속 받은 멤버(필드,메서드)를
		// 자식이 자신의 것 처럼 사용 가능
		
		
		
		
		
		return super.toString() + "/" + house;
	}
	









	
	
}
