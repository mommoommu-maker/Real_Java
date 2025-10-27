package day06.review;

public class Ex02_369게임 {

	/* 정수 1~100까지 수를 반복하여 출력하면서
	 * 해당 수가 3/6/9 가 될 때는
	 * 자리수마다 369가 되는 개수만큼
	 * 정수 대신 "*" 를 출력하는 프로그램
	 * 
	 * 순서도 :
	 * 반복문 => for문 쓰면 될듯
	 * 반복문 안에 if문도 있어야 할듯
	 * 
	 * 판단 : 십의자리수,일의자리수 3,6,9 확인해야해
	 * 십의 자리수 A 일의자리수B
	 * A and B -> "**"
	 * A or B -> "*"
	 * 십의 자리수 뽑아 먹는법 :
	 * i / 10 하면 됌! 소수점은 버려!
	 * 일의 자리수 뽑아 먹는법 :
	 * i % 10 하면 되것지
	 */
	
	public static void main(String[] args) {
		//int num = 100;
		
		
		for(int i=1; i<=100; i++) {
			
			int ten = i/10; //십의 자리수
			int one = i%10; //일의 자리수
			boolean ten369 = (ten==3||ten==6||ten==9);
			boolean one369 = (one==3||one==6||one==9);
			
			if(ten369&&one369)
				System.out.println("**");
			else if(ten369||one369)
				System.out.println("*");
			else
				System.out.println(i);
		}
	}
}
