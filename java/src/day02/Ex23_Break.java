package day02;

import java.util.Scanner;

public class Ex23_Break {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//true가 적히는 순간 그냥 무한 루프!
		while(true) {
			System.out.print("입력 : ");
			String input = sc.nextLine();
			
		/* equals :
		문자열이 비교 문자열과 일치하는지 여부를 반환하는 메소드 */
			if(input.equals("STOP"))
			break;
			System.out.println(">> "+input);
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}
