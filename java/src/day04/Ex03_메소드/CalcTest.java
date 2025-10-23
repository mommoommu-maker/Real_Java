package day04.Ex03_메소드;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//객체 생성
		Calculator calc = new Calculator();
		
		System.out.print("a : ");
		int a=sc.nextInt();
		
		System.out.print("b : ");
		int b=sc.nextInt();
		
		//덧셈
		int result1=calc.plus(a, b);
		System.out.println("a + b = "+result1);
		
		//뺄셈
		int result2=calc.minus(a, b);
		System.out.println("a - b = "+result2);
		
		System.out.print("x : ");
		double x = sc.nextDouble();
		System.out.print("y : ");
		double y = sc.nextDouble();
		
		//곱하기
		double result3=calc.multiple(x, y);
		System.out.println("x * y = "+result3);
		System.out.printf("x * y = %5.2f \n",result3);
		
		//나누기
		double result4=calc.divide(x, y);
		System.out.println("x % y = "+result4);
		System.out.printf("x % y = %5.2f \n",result4);
		
		/*
		 printf("포맷",변수) : %X,Y(리터널)
		 - X : 양수 - 크기만큼 칸을 지정하고 오른쪽 정렬
		 	   음수 - 크기만큼 칸을 지정하고 왼족 정렬
		 - Y : 지정한 크기만큼 소수점 아래 자리수를 표현(반올림)
		 (리터널) : %d(정수), %ㄹ(실수), %s(문자열)
		 \n : 개행
		 */
		
		//나머지
		int result5=calc.remain(a, b);
		System.out.println("a % b = "+result5);
		
		//합계&평균
		int arr[] = {10,20,30,40,50};
		System.out.println("합계 : "+calc.sum(arr));
		System.out.println("평균 : "+calc.avg(arr));
		
		sc.close();
		
	}
}
