//main 함수를 가지고 있는 CLASS
//Tip) C# : public static void Main()
//변수 : varivable
//변수 Scope (유효범위) : 선언되는 위치에 따라서 
//1.instance variable : 객체 변수 class Test{private int age;}
//2.local variable    : 지역 변수(함수 안에 선언된 변수)
//class Test{public void run(){int speed=0;}}
//3. static variable  : 공유 변수(객체 간 공유자원)

//설계도 == 클래스 == 타입(사용자 정의 타입)

class Test{
	int iv; //instance variable
	// 이 변수는 초기화를 하지 않아도 된다.(why? 기본값: default) 가지고 있다.
	// 왜 int iv = 100; 초기화를 하지 않아도 사용가능하게 했을까요?
	// 객체마다 다른 값을 갖게하기 위해서(ex 아파트마다 다른 층수를 갖게 하기 위해)
	
	void print() { 		//void의 경우 리턴값이 없다.
		int i = 100; 	// 함수 안에 있는 변수 => local variable
			   			// 함수가 호출되면 그때 stack 메모리에 생성되고, 함수가 종료되면 같이 소멸됨
		       			// 지역변수는 반드시 초기화를 하여야 한다.
		System.out.println(i);
	}
	
	void write() {
		System.out.println("iv 전역변수(객체)" + iv);
		//System.out.println(i);
		//Error : i 변수의 scope : print() 함수 내부
		int i = 200; //써도 됨. 위의 i는 지역변수이기 때문
		//int iv=300; Error는 아니지만, 의미가 없슴
	}
}

public class Ex01_variable {  
	public static void main(String[] args) { //프로그램의 시작점을 가지고 있는 클래스
		
		int s = 5; // local variable >> 선언과 동시에 초기화
		System.out.println("지역변수 : s " + s);
		
		int s2; //선언부
		s2 = 100; // 초기화
		System.out.println(s2);
		
		s2 = 300; //덮어쓰기됨
	}

}
