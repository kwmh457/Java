package test2;
/*
 * 
 * 날짜 : 23/12/29
 * 이름 : 방정환
 * 내용 : 자바 배열 출력 연습문제
 * 
 */

public class Test01 {
	public static void main(String[] args) {
		char str[] = {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'Y', 'O', 'U' };
		int row, co1;
		
		for (row = 1; row < 10; row ++) {
			for (co1 = 0; co1 <= row; co1++) {
				
				
				System.out.print(str[co1]);
				
			}System.out.print("\n");
		}	
		
	}

}
