package day01;

public class Ex08_FloatDouble {
	public static void main(String[] args) {
		/*float = 실수F
		 *double = 실수D
		 *자바에서 실수는 기본 D로 인식해서
		 *double 타입 리터널 생략 가능*/
		double var1 = 3.14;
		double var2 = 3.14D;
		
		//float var3 = 3.14; 이건 오류남
		float var3 = 3.14F;
		
		double var4 = 0.123456789123456789D;
		float var5 = 0.123456789123456789F;
		
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);
		System.out.println("var5 : "+var5);
	}
}
