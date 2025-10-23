package day02;

public class Ex16_WhileSum {

	public static void main(String[] args) {
		int a = 1;
		int result = 0;
		
		while(a<=100)
		{
			//result = result+a;
			//a++;
			//result += a++;
			result = result +a++;
		}
		System.out.println(result);
	}
}
