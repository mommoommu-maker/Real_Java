package day01;

import java.util.Scanner;

public class Ex02_Scanner {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			//클래스타입 객체명 = new name(); Scanner : 표준 입력 객체
			System.out.print("a : ");
			int a = sc.nextInt(); //이곳에서 입력 받음!
			System.out.println("a : "+ a);
			sc.close(); //sc 메소드 해제. 메모리 아끼려고 하는듯? 경고 풀림! 근데 해제 시키면 더이상 메소드 사용 불가함!
			sc.nextInt();
		}
}
