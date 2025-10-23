package day01;
import java.util.Scanner;

public class Ex09_Boolean {
	public static void main(String[] args) {
		/*true or false만 넣을 수 있어!
		 *==논리 값*/
		boolean check1 = false;
		boolean check2 = true;
		
		Scanner sc = new Scanner(System.in);
		boolean on = sc.nextBoolean();
		System.out.println("on : "+ on);
	}
}
