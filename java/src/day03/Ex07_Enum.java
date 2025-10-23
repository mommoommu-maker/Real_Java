package day03;
enum Test {A,B,C,D,F}
/*enum(열거타입) 정의 :
  enum은 파일로도 정의 가능!
  클래스 파일 내부에서 정의 할수도 있음! 
 */
public class Ex07_Enum {

	public static void main(String[] args) {
		Rainbow[] rainbow = Rainbow.values();
		//values를 사용하면..
		
		for (Rainbow color : rainbow) {
			System.out.print(color+" ");
		}
		System.out.println();
		
		Rainbow G = Rainbow.valueOf("PURPLE");
		System.out.println("G : "+G);
		
		int index = G.ordinal();
		System.out.println("PURPLEdml index ; "+index);
	}
}
