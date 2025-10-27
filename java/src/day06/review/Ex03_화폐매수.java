package day06.review;

import java.util.Scanner;

/* 큰 화폐단위부터 계산하여 화폐 단위별로 화폐 매수를 출력 프로그램
 * 
 * 희진이가 전자렌지 구매하라고 학원에 기부했다.
 * 이 때 전자렌지 구매비는 다음과 같이 현금으로 지급한다.
 * 구매비 : 657852
 * 50000 : 13개
 * 10000 : 0개
 * 5000 : 1개
 * 1000 : 2개
 * 500 : 1개
 * 100 : 3개
 * 50 : 1개
 * 10 : 0개
 * 5 : 0개
 * 1 : 2개
 * 
 * 순서도 :
 * 필요한 변수 선언 (입력금액, 화폐매수, 화폐단위)
 * 구매비 입력 받기
 * 화폐매수 계산하기
 * > 화폐매수 계산 : (화폐매수) = (입력금액) / (화폐단위)
 * >> 잔액 계산 :
 *     657852 - (50000*13) == 657852 % 50000
 *   1.  (잔액) = (입력금액) - (화폐단위 * 화폐매수)
 *   2.  (잔액) = (입력금액) % (화폐단위)
 * >>> 화폐 단위 변환
 *     : 번갈아 가면서 /5 , /2 연산 반복
 *     (화폐단위) = (화폐단위) /5
 *     (화폐단위) = (화폐단위) /2
 *     
 * 조건 :화폐 단위가 1원이 될 때까지 '>>>'번 과정 반복
 */
public class Ex03_화폐매수 {

	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("구매비 : ");
	int input = sc.nextInt(); //입력금액
	int money = 50000; //화폐단위
	int count = 0; //화폐매수
	boolean sw = true; //2,5 확인
	
	while(money>=1) {
		//(화폐매수) = (입력금액) / (화폐단위)
		count = input / money;
		System.out.println(money+"\t\t : "+count+"개");
		
		//(잔액) = (입력금액) % (화폐단위)
		input = input%money;
		
		if(sw) {
			//(화폐단위) = (화폐단위) /5
			money = money/5;
		} else {
			//(화폐단위) = (화폐단위) /2
			money = money/2;
		}
		sw = !sw;
		
	}
		sc.close();
	}
	
}
