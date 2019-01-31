/*
 * 자바는 시스템에서 기본적으로 제공하는 8가지 기본 타입을 가지고 있다
 * 8가지 기본 타입은 값을 저장한다.
 * Tip) [값]과 [주소값]를 저장할 수 있다.
 * 
 * 숫자 -> 정수(음의 정수, 0 , 양의 정수) -> byte(-128~127)
 * 										  -> char(한 문자를 표현하는 자료형: 한 문자는 2byte), unicode
 * 										  -> short ... (c언어의 호환성)
 * 										  -> int(-21억 ~ 21억)**java 정수 연산의 기본 타입
 * 										  -> long(8byte) int보다 큰 값
 * 		
 * 		-> 실수(부동 소수점) 			  -> float(4byte), double(8byte)
 * 										  -> double이 정밀도가 높다(표현 범위가 크다)
 * 										  -> double이 java 실수 연산 기본타입
 * 		
 * 		-> boolean(true, false)           -> 프로그램의 논리 제어
 * 
 * Q) 문자열의 표현(ex "홍길동 안녕하세요")
 * String은 클래스 : String s = new String("안녕하세요");
 * 앞 예제 : String s = "안녕하세요";
 * String 대해서 별도의 언급이 있기까지는 String도 int처럼 쓰세요.
 * 
 * 값 타입: 메모리에 값(숫자,논리)이 들어있음
 * 참조 타입: 메모리에 값(클래스, 배열)이 주소(번지)로 들어있음
 * 
 * class == 설계도 == 타입(Type)
 * class는 작은 타입을 모아 놓은 큰 타입
 * 
 * class는 반드시 메모리에 올려놓고 사용(new)
 */

//최소한 설게도라고 할려면, [속성(상태정보)] + [행위(기능)]를 가지고 있어야 한다. -> 이것을 변수로!
class Car{
	String color; //색상을 담겠다!!
	int window;   //자종차의 창문 개수
}

public class Ex04_DataType {
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println("c라는 변수의 값: " + c); //Car@5c8da962 주소값(번지) >> 참조 타입
		
		Car c2;
		c2 = c; // new로 만든 주소값을 할당할 때는 new를 안 써도 된다.
		System.out.println(c==c2);
		
		Car c3;    // 선언
		c3 = new Car(); //할당
		System.out.println("c3라는 변수의 값: " + c3);
		c3.color ="gold";
		c3.window =10;
		System.out.println(c3.color + ":" + c3.window);
		
		int i = 200;
		System.out.println(i); //200 >> 메모리 안에 값이 200
		
		int j; //선언
		j = 1000;
		
		int a, b; // 반드시 초기화
		a=10; 
		b=20;
		
		int k = 1111;
		int k2 = k;
		k=2222;
		
		//int(-21 ~ 21 )
		//int number = 10000000000; //오류(컴파일 에러)
		// 정수 리터럴의 표현 범위는 int 까지 (Today Point)
		// 정수 리터럴 >> 표현 숫자값
		// 접미사 L
		long number = 10000000000000L; // 정수 리터럴 값을 long으로 인지
		System.out.println("long 타입 : " + number);
		
		//char : 정수 값을 가지고 있다(2byte)
		//문자를 표현하는 타입
		//1. 한 문자 > 2byte 통일
		//2. 한글 한 자 : 2byte
		//3. 영문자, 숫자, 특수문자, 공백 : 1byte
		// but, 한글이나 영문 모두 다 한개의 문자 표현은 2byte로!
		
		//java 문자열 : " " (String s = "가")
		//java 문자(한 문자) : ' ' (char c = '가')
		
		char single = '가';
		System.out.println(single);
		
		char ch = 'A';
		System.out.println((int)ch); //casting 타입변환 // 아스키 코드표 10진수값
		// A:65 , a:97
		
		char ch1 = 'a';
		System.out.println((int)ch1);
		
		int ch2 = 65;
		System.out.println((char)ch2);// 명시적 형변환
		
		int cint = ch; //암시적 형변환 // 사실은 컴파일러가 (int) ch;
		
		/*
		 * Today Point
		 * 
		 * 변수가 가지고 있는 [값을 보지 말고] [변수의 타입]을 보세요
		 * 타입의 크기를 보자
		 * 큰 타입에는 작은 타입 값을 넣을 수 있다.
		 * 작은 타입에는 큰 타입 값을 넣을 수 없다.
		 * 
		 */
		
//		int intvalue = 103029970;
//		byte bytevalue = (byte)intvalue; // 값을 버려요! 손실발생(오류는 안나나, 압축해서 손실나는 로직을 모름)
//		System.out.println(bytevalue); // 쓰레기값
		
		int intvalue = 10;
		byte bytevalue = (byte)intvalue; //10이 byte범위에 들어가 byte로 변환해도 손실은 발생하지 않으나,
		System.out.println(bytevalue); 		// 일반적으로 우리는 예상할 수 없기때문에 사용하지 말것
		
		//String (문자열) 타입
		
		//POINT : String 일반 값 타입처럼 써도 전혀 문제가 없다. 다만 String이 누적되면 
		// 힙 메모리에 계속 메모리를 생성하므로(프로그램이 종료되지 않는 이상 삭제 안됨) 성능을 
		// 많이 떨어뜨린다. StringBuilder 컬렉션 등을 사용해야 함.
		
		//010-8360-5668
	}

}
