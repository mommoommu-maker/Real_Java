package day06.review;

import java.util.Scanner;

public class Ex05_2차원배열 {
	
	public static void main(String[] args) {
		/*
		 * 양의 정수 M과 N을 입력받아 저장하고
		 * M행 N열의 2차원 배열을 생성한다.
		 * 각 요소의 값을 입력받고 그대로 출력해.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("M : ");
		int M = sc.nextInt();
		System.out.print("N : ");
		int N = sc.nextInt();
		
		//M행 N열의 2차원 배열 선언&생성
		int arr[][] = new int[M][N];
		
		//입력 받기
		
		//2차월 배열은 이중반복문으로 접근
		/*
		 * 바깥쪽 반복문 : i (행에 접근)
		 * 안쪽 반복문 : j (열에 접근)
		 * arr.length : 행의 개수
		 * arr[i].length : 열의 개수
		 */
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		//foreach문으로 2차원 배열 출력
		System.out.println("------------------------");
		for (int[] row : arr) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
