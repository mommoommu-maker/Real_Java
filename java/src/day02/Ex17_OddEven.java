package day02;

public class Ex17_OddEven {

	public static void main(String[] args) {
		int a = 1;
		int sum1 = 0;
		int sum2 = 0;
			
		while(a<=20) {
			//홀수
			if(a%2==1) sum1 = sum1+a;
			
			//짝수
		    if(a%2==0) sum2 = sum2+a;
		    a++;
		}
		System.out.println("홀 : "+sum1);
		System.out.println("짝 : "+sum2);
	}
}
