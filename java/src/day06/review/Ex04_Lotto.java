package day06.review;


/*
 * Math.random() ; 0.xxx ~ 0.9xxx 사이의 난수를 반환하는 메소드
 * 
 * (int)(Math.random() * [개수]) + (시작숫자)
 * Ex) 1~20사이 랜덤수 / -20~20 사이의 랜덤수
 * 공식 : int dice = (int)(Math.random)
		 int dice2 = (int)(Math.random()*20)+1;
		 System.out.println("Dice2 : "+dice2);

		 int dice3 = (int)(Math.random()*41) -20;
		 System.out.println("Dice3 : "+dice3);
 */

public class Ex04_Lotto {

	public static void main(String[] args) {
		double random = Math.random();
		System.out.println(random);
		
		int dice = (int)(Math.random()*6)+1;
		System.out.println("Dice : "+dice);
		
		int lotto[] = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i]= (int)(Math.random()*45)+1;
			
			//중복제거
			for (int j = 0; j <= i-1; j++) {
				if(lotto[i]==lotto[j]) {
					i--; //순서를 다시 돌려서 다시 뽑음!
					break;
				}
			}
		}
		
		//오름차순 정렬
		for(int i=0; i<lotto.length-1; i++) {
			for(int j = i+1; j<lotto.length; i++) {
				if(lotto[i]>lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		System.out.println("## 로또 번호 ##");
		for(int i : lotto) {
				
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
