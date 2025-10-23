package day03;

import java.util.Scanner;

public class Ex01_Array {

	public static void main(String[] args) {
		/* 배열 선언 : 
		   자료형 변수이름[];
		   int []arr; 처럼 앞 대괄호 가능 */
		Scanner sc = new Scanner(System.in);
		
		int arr[];
		arr = new int[5];
		int arr2[] = new int[5];
		int arr3[] = {1,2,3,4,5};
		
		//배열 요소 접근 방법 :
		arr[0] = 1; 
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int N = arr.length; //배열길이,배열 요소 개수 = 배열.length
		System.out.println("배열의 길이 : "+N);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
