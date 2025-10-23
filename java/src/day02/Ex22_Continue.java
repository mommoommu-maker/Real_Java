package day02;

import java.util.Scanner;

public class Ex22_Continue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for(int i = 0; i<=5; i++) {
			int n = sc.nextInt();
			if(n<0) continue;
			sum += n;
		}
		/*
		 continue : 남은 실행문을 무시하고 다음 반복으로 점프
		 while : 조건식으로 돌아감.
		 for : 증감식으로 돌아감. 
		 */
		System.out.println("양수의 합 : "+sum);
		sc.close();
	}
}
