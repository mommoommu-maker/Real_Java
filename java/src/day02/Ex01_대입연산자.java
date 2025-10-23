package day02;

import java.util.Scanner; //외부에서 가져오는 클래스

public class Ex01_대입연산자 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //입력 객체 생성
		
		System.out.print("x : ");
		int x = sc.nextInt(); // x값 입력 받음
		
		System.out.print("y : ");
		int y = sc.nextInt();
		
		System.out.print("z : ");
		int z = sc.nextInt();
		
		int sum = x+y+z;
		double avg = sum / 3;
		/*int타입으로 계산 됌! double이어도 실수 안나옴..
		 *실수로 받고 싶으면 실수로 만들어줘야겠지.*/
		System.out.println("합계 : "+sum);
		System.out.println("(이건 int로 계산 된) 평균 : "+avg);
		
		double realAvg1 = (double)sum/3;
		double realAvg2 = sum / 3.0;
		/*double + int = double
		 *=> 서로 다른 자료형 연산 시, 결과는 큰 자료형으로 변환.*/
		
		System.out.println("(이건 double로 계산 된) realAbg1 : "+realAvg1);
		System.out.println("realAbg2 : "+realAvg2);
	}
}
