package day02;

import java.util.Scanner;

public class Ex14_SwitchYield {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		String result = switch (num % 5) {
		case 0,1 -> "*";
		default -> {
			System.out.println("**");
			yield "yield**";
			}
		};
		System.out.println(result);
		sc.close();
	}
}
