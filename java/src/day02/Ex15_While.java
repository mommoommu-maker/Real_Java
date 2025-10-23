package day02;

public class Ex15_While {

	public static void main(String[] args) {
		
		/*while(조건) {반복 실행문}
		  -반복문에는 반드시 종료 조건이 성립 하도록 작성 할 것!
		   ->종료 조건이 만족하지 않으면 무한 루프 시작해ㅠㅠ*/
		int a = 1;
		
		while(a<=10) {
			System.out.print(a+ " ");
			//a = a+1;
			//a += 1;
			a++;
		}
		System.out.println();
		System.out.println("a : "+a);
	}
}
