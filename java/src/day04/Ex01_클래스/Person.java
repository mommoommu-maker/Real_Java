package day04.Ex01_클래스;

/**
 Class 정의
 1. 변수 : 이름, 나이
 2. 메소드 : 밥먹기, 일하기
 */

	//변수
public class Person {
	String name;
	int age;
	
	/* 메소드 : 
	접근지정자(static) 반환타입 메소드명(매개변수){} */
	
	//먹기 메소드
	public void eat(String menu) {
		System.out.println(menu+"(을/를) 먹었습니다.");
	}
	
	//일하기 메소드
	public int work(String name, int hour) {
		int money=10030;
		int salary=money*hour;
		System.out.println(name+" ");
		System.out.println(salary+"원을 벌었습니다.");
		return salary;
	}
	
}
