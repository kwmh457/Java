package sub2;

import java.util.Scanner;

public class switchTest {
	
	
/*
*  날짜 : 2023/12/27
*  이름 : 방정환
*  내용 : Java 조건문 switch 실습하기
* 
*/
	
	
	
	public static void main(String[] args) {
		
		System.out.print("숫자 입력 : "); // 시스 아웃은 콘솔
		
		// 사용자 입력
		Scanner scan = new Scanner(System.in); // 시스인은 키보드
		int number = scan.nextInt();
		// 덩어리로 기억
		System.out.println("입력한 숫자 : " + number);
		
		switch (number % 2) {
		case 0 :
			System.out.println("nmber는 짝수 입니다.");
			break;
		case 1 :
			System.out.println("nmber는 홀수 입니다.");
			break;
			
		}
		
		
	}

}
