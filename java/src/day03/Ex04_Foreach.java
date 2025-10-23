package day03;

public class Ex04_Foreach {

	public static void main(String[] args) {
		String[] week = {"월","화","수","목","금","토","일"};
		
		/*foreach : 
		  for(자료형 반복요소이름 : 배열) {} */
		
		for (String day : week) {
			System.out.print(day + " ");
		}
		System.out.println(); //이건 foreach
		//조건식 변경 불가능, 무조건 처음부터 끝까지 반복
		
		for (int i = 0; i < week.length; i++) {
			System.out.print(week[i] + " "); //이건 기본 for
		}
		//조건식 변경 가능
	}
}
