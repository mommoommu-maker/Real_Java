package day06.review;

import java.util.Scanner;

public class Ex01_배수 {

	/*
	 * 프로그램 실행 시 가장 먼저 실행되는 메소드
	 */
	
	public static void main(String[] args) {
		/*
		 * 정수 하나를 입력 받아서
		 * 입력 받은 수가 3의 배수인지 판단하고
		 * 그 여부를 출력하는 프로그램
		 * 3 배수 O : "3의 배수 입니다."
		 * 3 배수 X : "3의 배수가 아닙니다."
		 * 
		 * 순서도 :
		 * 입력 받을 정수
		 * 3의 배수인지 판단
		 * 배수 여부 결과 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if(N !=0 && N%3==0) {
			System.out.println("3의 배수 입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		//위와 같은 코드임! => if~else 구문과 치환할 수있다.
		//조건 연산자로 쓸 수 있다.
		//( 조건 ) / (참일 때 값) : (거짓일 때 값)
		String answer = (N !=0 && N%3==0) ? "3의 배수 입니다." : "3의 배수가 아닙니다.";
		System.out.println(answer);
		
		sc.close();
	}
}
