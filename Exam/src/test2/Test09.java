package test2;
/*
 *  날짜 : 2023.12.30
 *  이름 : 홍길동
 *  내용 : 자바 최대공약수 재귀 메서드 연습문제
 * 
 * 유클리드 호재법
 * - 두 개의 자연수에 대한 최대공약수를 구하는 대표적인 기법
 * - 두 자연수 A, B에 대해서 A>B일떄 A를 B로 나눈 나머지를 R 이라고 하면
 *   A와 B의 최대공약수는 B와 R의 최대공약수 같다.
 * 
 *  예) 192와 162의 최대공약수는 아래와 같다..
 * 단계  A   B
 * 1   192  162
 * 2   162   30
 * 3    30   12
 * 4    12    6
 */

	
public class Test09 {
	public static void main(String[] args) {
		System.out.println("    1과      5의 최대공약수 : " + gcd(5,1));
		System.out.println("    3과      6의 최대공약수 : " + gcd(6,3));
		System.out.println("   12과    18의 최대공약수 : " +  gcd(12,18));
		System.out.println("   60과    24의 최대공약수 : " +  gcd(60,24));
		System.out.println("  192과  162의 최대공약수 : " +   gcd(5,1));
	}
	public static int gcd(int a, int b) {
		if(a%b==0) {
			return b;
		}else {
			return gcd(b,a%b);
		}
	}
	
	}


