package day03;

import java.util.Scanner;

public class Ex06_Arrays {

	public static void main(String[] args) {
		/*
		 1열 2열 짝이 맞으면 => 정방 행렬
		          안맞으면 => 비정방 행렬
		*/
		
		int arr[][] = new int[3][]; //열은 생성 안된거지
		
		arr[0] =new int [2];
		arr[1] =new int [4];
		arr[2] =new int [3]; //이런식으로 되면 비정방 행렬인거야.
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt(); //j에 입력받겠지
			}
		}
		
		//출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		//foreach 출력
		/*
		for (int[] a : arr) {
			for (int[] b : a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		*/
		
		//이건 3차원 배열
		int three[][][] = {{{1,2},{3,4}},{{5,6},{7,8}},{{9,10},{11,12}}};
		
		for (int[][] two : three) {
			for (int[] one : two) {
				for (int num : one) {
					System.out.print(num+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		sc.close();
		}
	}