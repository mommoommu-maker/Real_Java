package day02;

import java.util.Scanner;

public class Ex12_Grade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학점 : ");
		String grade = sc.next();
		
		switch (grade) {
		case "A","a": System.out.println("90점 이상 입니다.");break;
		case "B","b": System.out.println("80~89점 입니다.");break;
		case "C","c": System.out.println("70~79점 입니다.");break;
		case "D","d": System.out.println("60~69점 입니다.");break;
		case "F","f": System.out.println("60점 미만입니다.");break;
		default:System.out.println("A~F 사이의 문자를 입력하세요.");break;
		}
		sc.close();
	}
}
