package day01;

public class Ex07_long {
	public static void main(String[] args) {
		long ln1 = 1000;
		long ln2 = 2100000000;
		//long ln3 = 2200000000; //이거 왜 에러남?
		/*자바에서 기본 정수는 int 타입으로 인식함..!!*/
		long ln3 = 2200000000L;
		/*L을 붙이지 않으면 기본정수를 int로 인식해서
		 *21억을 표현할 수 없다.*/
		
		System.out.println("ln1 : "+ ln1);
		System.out.println("ln1 : "+ ln2);
		System.out.println("ln1 : "+ ln3);
		
		}
}
