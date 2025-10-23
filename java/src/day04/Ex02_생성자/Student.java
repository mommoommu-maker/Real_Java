package day04.Ex02_생성자;

//import java.sql.Struct;

/*
 학생 클래스 정의 할거야
 변수 : 이름, 나이, 학번, 전공
 메소드 : 공부하기, 성적 평균 구하기
 */

public class Student {
	//변수
	String name;
	int age;
	String stdNo;
	String major;

	/* 생성자
	  (단축키 : alt+shift+S -> o */
	
	//기본 생성자
	public Student() { //그냥 이렇게 해도 되는데 this. 써는게 더 좋아.
		name = "이름없음";
		age = 0;
		stdNo="00000000";
		major = "전공없음";
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age=age;
		this.stdNo="00000000";
		this.major = "X";
		
	/*=> this(name,age,"00000000","X");
	 	 위를 다 합치면 이렇게! 이 한줄로 정리 되나보당
	 */
	}
	
	/*매개변수가 있는 생성자
	 this.name은,, name은 매개변수 가리키는중 
	 */
	public Student(String name, int age, String stdNo, String major) {
		this.name = name;
		this.age = age;
		this.stdNo = stdNo;
		this.major = major;
	}
	
	/*
	 메소드
	 접근지정자 반환타입 메소드명(매개변수) {}
	 
	 void : 반환타입 없어서 return 생략 가능
	 -void로 지정해도 return을 메소드를 종료시키는 용도로 사용할수있다.
	 */
	
	public void study(String subject) {
		System.out.println(subject+"(을/를) 공부합니다.");
	}
	
	//성적 평균 구하기
	public double getAverage(int score1,int score2) {
		double average = 0.0;
		average = (double)(score1+score2)/2;
		return average;
	}
	
	public double getAverage(int score1,int score2,int score3) {
		double average=0.0;
		average=(double)(score1+score2+score3)/3;
		return average;
	}
	
	//배열 사용할수도 있어!
	public double getAverage(int[] scores) {
		double average = 0.0;
		int sum=0;
		
		//평균 구하기 코드
		for (int i = 0; i < scores.length; i++) {
			//일단 더해!
			sum = sum+scores[i];
		}
		//그리고 나눠! 평균 = 합계 / 개수
		average = (double)sum/scores.length;
		return average;
	}
}
