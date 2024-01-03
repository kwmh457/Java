package sub6;
/*
 * 날짜 : 2024/01/03
 * 이름 : 방정환
 * 내용 : Java 다형성 실습하기
 * 
 */

public class PolyTest {
	
	
	
	public static void main(String[] args) {
		
		// 업 캐스팅으로 다형성 구현
		Animal t = new Tiger();
		t.move();
		t.hunt();
		
		Animal e = new Eagle();
		e.move();
		e.hunt();
		Animal  s = new Shark();
		s.move();
		s.hunt();
		// 타입이 갔다는 건 자료구조가 같다는 것
		
		// 객체 타입 비교 연산
		if(t instanceof Tiger) {
			System.out.println("t는 Tiger 입니다.");
			
		}
		if(e instanceof Eagle)  {
			System.out.println("e는 Eagle 입니다.");
			
		}if(s instanceof Shark) {
			System.out.println("s는 Shark 입니다.");
			
		}
		 
		
		
	
	}
}

