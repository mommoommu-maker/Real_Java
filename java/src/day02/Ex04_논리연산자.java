package day02;

public class Ex04_논리연산자 {
	public static void main(String[] args) {
		/*AND(&&) OR(||) NOT(!)*/
		
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);
		System.out.println();
		
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		System.out.println();
		
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();
		
		/*이미 앞에서 계산이 끝났기 때문에 경고 코드는 죽은 코드임..!*/
		
		/*쇼트 서킷
		 *: 논리 연산의 결과를 미리 알아서, 남은 논리식을 실행하지 않는 것.*/
		int value1=3;
		System.out.println(false && ++value1>10);
		System.out.println("value1 : "+value1);
		//뒤 조건이 실행 되지 않기 때문에 value1 값이 3이겠지..
		
		int value2=3;
		System.out.println(true || ++value2>10);
		System.out.println("value2 : "+value2);
		
		//비트 연산자는 쇼트 서킷 X
		int value3=3;
		System.out.println(false & ++value3>10);
		System.out.println("value3 : "+value3);
		
		int value4=3;
		System.out.println(true | ++value4>10);
		System.out.println("value4 : "+value4);
	}
}
