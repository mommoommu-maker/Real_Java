package day02;

public class Ex03_증감연산자 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;
		int x = 10;
		int y = 20;
		int z;
		
		//++a
		c = ++a + b;
		System.out.println("c = "+ c);
		System.out.println("a = "+ a);
		
		//a++
		z = x++ + y;
		System.out.println("z = "+z);
		System.out.println("x = "+x);
	}
}
