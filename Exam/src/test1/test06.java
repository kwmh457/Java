package test1;
import java.util.Scanner;
/*
 * 날짜 :2023/12/28
 * 이름 : 방정환
 * 내용 : 자바 삼항연산자 연습문제
 * 
 */
public class test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x 값 입력 : ");
		int x = sc.nextInt();
		
		System.out.print("y 값 입력 : ");
		int y = sc.nextInt();
		
		String result = x > y ? "x가 더 큼니다." : "y가 더 큽니다.";
		
		System.out.println(result);
		sc.close();
		

	}

}
