package day03;

public class Ex05_Arrays {

	public static void main(String[] args) {
		//2차월 배열 선언
		int arr[][]=new int[2][3];
		
		arr[0][0] = 1;
		arr[0][1] =	2;	
		arr[0][2] =	3;
		
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		/*
		 arr.length    : 1번째 차원의 배열요소 개수
		 arr[i].length : 2번째 차원 배열요소 개수
		 */
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
				//j가 4 되면 나갈거 아니야 그럼 다시 들어왔을때 4야?
			}
			System.out.println();
		}
	}
}
