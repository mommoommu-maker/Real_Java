package day01;

public class Ex03_Varialble {
	public static void main(String[] args) {
		int x; //int형 변수 x선언;
		int y, b; //여러 변수 동시 선언함. 콤마로 구분됌;
		int m=30, q=20; //여러 변수 선언과 동시에 초기화 가능;
		x=100; //후에 초기화도 가능하고 나중에 값 수정 가능하기도 해;
		y=200;
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		System.out.println("x + y ="+(x+y));
		System.out.println("(x+y)/2="+((x+y)/2));
	}
}
