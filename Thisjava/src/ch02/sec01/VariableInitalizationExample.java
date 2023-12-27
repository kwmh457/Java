package ch02.sec01;

public class VariableInitalizationExample {
	public static void main(String[] args) {
		// 변수 value선언
		int value = 30;
		
		// 연산 결과를 변수 result의 초기값으로 대입
		int result = value + 10;
		
		// 변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);
		
		
		int hour = 3;
		int minute = 5;
		System.out.printf("%d + 시간 + %d + 분 " ,hour,minute);
	}

}
