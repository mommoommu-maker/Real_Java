package day02;

import java.util.Scanner;

public class Ex10_중첩If {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학년 : ");
		int year = sc.nextInt();
		System.out.print("점수 : ");		
		int score = sc.nextInt();

		/*
		if(year==4){
			if(score>=60) {
				System.out.println("합격!");
			}
			else {
				System.out.println("불합격!");
			}
		}
		else {
			System.out.println("응시자격이 없습니다.");
		}
		sc.close();
		
		가능하다면 중첩되지 않는 형태로 작성하는 것을 권장한다.
		*/
		if(year==4&&score>=60)
			System.out.println("합격!");
			
		else if(year==4&&score<60)
			System.out.println("불합격!");
			
		else 
			System.out.println("응시자격 없더ㅜ");
		sc.close();
		
		/*
		 	if(year != 4)
			System.out.println("응시자격 없더ㅜ");
			
		else if(score >= 60)
			System.out.println("합격!");
			
		else 
			System.out.println("불합격!");
		sc.close(); 
		 */
	
	}
}
