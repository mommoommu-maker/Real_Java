package Day05.Ex02_인자전달;

public class CallByValue {

	public static int sum(int a,int b) {
		int sum=a+b;
		a=100;
		b=200;
		System.out.println(":::: sum() 메소드 ::::");
		System.out.println("(a,b) : "+a+", "+b);
		return sum;	
	}
	
	public static void main(String[] args) {
		int a = 10; //변수 이름이 같을뿐..sum 메소드의 a,b와 다른 친구야!
		int b = 20;
		
		System.out.println(":::: main() 메소드 호출 ::::");
		System.out.println("(a,b) : "+a+", "+b);
		
		int sum = sum(a,b);
		System.out.println("sum : "+sum);
		
		System.out.println(":::: sum() 메소드 호출 후 ::::");
		System.out.println("(a,b) : "+a+", "+b);
	}
}
