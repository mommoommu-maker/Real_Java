package day02;

public class Ex06_조건연산자 {
	
	public static void main(String[] args) {
		
		int a = 3,b=5;
		int result=(a>b)?a-b : b-a;
		System.out.println("두 수의 차 : "+result);
		
		//조건 연산자를 if로 쓴다면..
		if(a>b)
			result = a-b;
		else
			result = b-a;
		System.out.println("result : "+result);
	}
}
