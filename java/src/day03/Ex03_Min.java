package day03;

import java.util.Scanner;

public class Ex03_Min {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //N 입력받고
		
		int arr[] = new int[N];//배열 선언,생성
		int min = Integer.MAX_VALUE;
		/*Integer.MAX_VALUE :
		  자료형의 가장 큰 수를 가져옴!*/
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("min value : "+min);
		
		sc.close();
	}
}
