package day01;

public class Ex05_Byte {
	public static void main(String[] args) {
		/*byte == 1byte
		 *1byte == 8bit*/
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		//byte var5 = 128; 이건 오류나! overflow이기 때문.
		byte var5 = (byte)128; //var5 수정 코드
		
		System.out.println("var1 : "+ var1);
		System.out.println("var2 : "+ var2);
		System.out.println("var3 : "+ var3);
		System.out.println("var4 : "+ var4);
		System.out.println("var5 : "+ var5);
		/*var5 왜 양수 됐심..ㅠ
		 * => 128 값을 넣을수 없어서 한바꾸 돌아버려
		 * -128이 된거지. 만약 130으로 하면 -126 되려나?*/
	}
}
