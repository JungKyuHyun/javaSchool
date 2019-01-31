//연산자
public class Ex06_Operation {
	public static void main(String[] args) {
		int result = 100/100;
		System.out.println(result);
		
		result = 13/2;
		System.out.println(result);
		
		result = 13%2;
		System.out.println(result); //나머지 
		
		//증가감 연산자(++, --) 1씩 증가하거나 1씩 감소
		int i = 10;
		++i; //전치 증가
		System.out.println(i);
		i++; //후치 증가
		System.out.println(i);
		// 변수 1개 : 전치, 후치 동일
		
		//POINT : 전치와 후치 연산자는 결합하면 본질을 ....!!!
		int i2 = 5;
		int j2 = 4;
		
		int result2 = i2 + ++j2;
		System.out.println(result2); //j2 1증가 시키고 + 연산
		
		// 현재 i2 = 5, j2 = 5
		result2 = i2 + j2++;
		System.out.println(result2);
		// 현재 i2 =5, j2=6
		System.out.println("i2 값은 : " + i2 + "," + "j2 값은 : " + j2);
		
		//POINT
		//자바의 연산 규칙
		//정수의 모든 [연산]은 int로 변환 후 처리
		//byte + byte => 컴파일러는 int + int 로 인지한다. ==>> 결론은 byte+ byte는 int로 받아야한다.
		
		byte b = 100; // -128 ~ 127
		byte c = 1;
//		byte d = b + c; // 이러면 오류!!
		int d = b  + c;
		System.out.println(d);
		
		//1. byte d = (byte)(b+c); 캐스팅해서 일부를 버림/쓰레기 값이 발생 가능/일단 101 숫자가 1byte 표현 가능해서 괜춘긴함...
		//2. int d = b+c; 
		
		//byte + short = int + int
		//char + char = int + int
		//POINT : 연산에 int 보다 작은 타입은 int형으로 변환후 처리(단 long 제외, int보다 크기 때문)
		//byte, char, short -> int 바꾸어서 연산 처리
		
		//int + long = long + long >> 결과 long
		
		// 정수와 실수 >> 실수(바이트 크기가 같더라도 무조건 실수가 이김)
		//float + int = float + float >> 결과 float
		//long + float = float + float >> 결과 float
		//float + double = double + double >> 결과 double
	}

}
