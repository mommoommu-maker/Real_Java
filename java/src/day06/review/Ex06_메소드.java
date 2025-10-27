package day06.review;

import java.util.Scanner;

public class Ex06_메소드 {
	
	//메소드 정의
	public static int plus(int a, int b) {
		int result = a+b;
		return result;
	}
	public static int minus(int a, int b) {
		if(a<0||b<0) {
			return 0;
		}
		int result = a-b;
		return result;
		
		//return(값); -> return; (값)이 없는 경우 반환타입 void로 지정해야 한다.
		//값을 메소드를 호출한 자리로 반환한다.
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		
		System.out.println(plus(a,b));
		System.out.println(minus(a,b));
		sc.close();
	}
}
