package day02;

public class Ex21_GuguAll {
	public static void main(String[] args) {
		/*단에 대한 반복 : 2~9 j
		 *각 단의 곱 : 1~9 i */
		
		//가로로 볼 때 편함
		for(int i = 1; i<=9; i++)
		{
			for(int j=2; j<=9; j++)
			{
				System.out.print(j+"X"+i+"="+(i*j));
				System.out.println("\t"); //탭(공백)
			}
			System.out.println();
		}
		
		/*이건 세로로 볼 때 편하게
		for(int i = 2; i<=9; i++)
		{
			for(int j=1; j<=9; j++)
			{
				System.out.print(i+"X"+j+"="+(i*j));
				System.out.println("\t"); //탭(공백)
			}
			System.out.println();
		}
		*/
	}

}
