package day03;

public class Ex08_String {

	public static void main(String[] args) {
		//문자열 리터널
		String a = "Hello";
		String b = "Java";
		String c = "Hello"; //a와 같은 주소 값을 가리킴!
		
		//문자열 객체 생성
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");
		
		System.out.println("a==c : "+(a==c));
		System.out.println("a==d : "+(a==d)); //결과 : F
		//F인 이유는..객체로 만들어졌기 때문! 주소 값이 달라! 
		System.out.println("문자열 비교 : "+a.equals(d));
		
		System.out.println("e==f : "+(e==f)); //결과 : F
		System.out.println("문자열 비교 : "+e.equals(f)); //T
		//왜..?
	}
}
