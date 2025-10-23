package day02;

import java.util.Scanner;

public class Ex20_Gugu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(input + " X "+i+" = "+(input*i));
		}
		
		sc.close();
	}
}
