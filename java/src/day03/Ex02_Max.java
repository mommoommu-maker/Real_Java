package day03;

import java.util.Scanner;

public class Ex02_Max {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //N 입력받고
		
		int arr[] = new int[N];//배열 선언,생성
		int max = Integer.MIN_VALUE;
		/*Integer.MIN_VALUE :
		  자료형의 가장 작은 수를 가져옴!*/
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Max value : "+max);
		
		sc.close();
	}
}
