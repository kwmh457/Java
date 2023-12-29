package sub3;

/*
 * 날짜 : 23/12/29
 * 이름 : 방정환
 * 내용 : 메서드 형태 실습하기
 *  
 */


public class MethodTypeTest {
	
	public static void main(String[] args) {
		
		double y1 = type1(1.5);
		double y2 = type1(1.7);
		
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		
		type2(true);
		type2(false); // 대입 연산자가 없으면 리턴값을 안해도 됨 그래서 대입 연산자도 안씀
		
		boolean result = type3();
		System.out.println("result : " + result);
		
		type4();
		
		
		
	}

	
    // 형태 1 - 매개변수 o , 리턴값 o
	public static double type1(double x) {
     double y  = (x *x) + 3.14;
     return y;
		
	}

	
	// 형태 2 - 매개변수 o , 리턴값 x
	
	public static void type2(boolean status) {
		
		if(status) {
			System.out.println("참 입니다.");
		}else {
			System.out.println("거짓 입니다.");
		}
	}
	
	// 형태 3 - 매개변수 x , 리턴값 o
	public static boolean type3() {
		
		int num1 = 1;
		int num2 = 2;
		
		if(num1>num2) {
			return true;
			
		}else {
			return false;
		}
		
	}
	
	// 형태 4 - 매개변수 x , 리턴값 x
	public static void type4() {
		
		double result = type1(2.5);
		System.out.println("반지름 길이가 2.5인 원의 넓이 : " + result);
		
	}
}

