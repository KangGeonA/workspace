package a00_testProject;

 // class : 자바코드를 작성하는 영역
public class JaveTest {

	//main 메서드 (method, 기능)
	// - 자바 프로그램(프로젝트, 애플리케이션)
	//   실행시키기 위해 반드시 필요한 구문(기능)
	public static void main(String[] args) {
		
		// system.out.printli() : ()안의 문자열 출력 후 엔터 한줄출력
		System.out.println("Hello World!!!");
		
		System.out.println("안녕하세요");
		//숫자만 작성하면 연산
		System.out.println(3500 + 6000);
		//사칙연산 우선순위를 그대로 적용
		//숫자 + "문자열" = 숫자문자열 (이어쓰기, 추가하기, 덧붙이기)
		System.out.println(1000 + 2000 + "원");
		
		System.out.println("강건아");
		System.out.println("만 " + 26 + "세");
		
		//김밥 : 2000원, 떡볶이 : 3000원
		System.out.println(2000 + 3000);
		System.out.println("합계 : " + 2000 + 3000 + " 원");
		System.out.println("합계 : " + (2000 + 3000) + " 원");
		//합계 : 5000원 
		
		//연삽우선순위 문제
		//"합계 : " + 2000 = "합계 : 2000"
		//"합계 : 2000" + 3000 = "합계 : 20003000"
		//"합계 : 20003000" + "원" = "합계 : 20003000원 "
	}
	
}
