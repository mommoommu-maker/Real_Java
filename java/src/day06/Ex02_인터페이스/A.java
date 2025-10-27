package day06.Ex02_인터페이스;

public class A {

	int a,b;
	
	class B{
		public int x;
		public int y;

		public void bMethod() {
			System.out.println("이너 클래스에서 아우터 클래스의 멤버 접근 가능");
			System.out.println("A의 a : "+a);
			System.out.println("A의 b : "+b);
		}
	}

	
	 //바깥에서  A 안에 있는 변수에 접근 불가
	public void aMethod() {
		System.out.println("아우터 클래스에서 이너 클래스의 멤버 접근 불가");
		//System.out.println("B의 x : "+x);
		//System.out.println("B의 y : "+y);
	}
	
}
