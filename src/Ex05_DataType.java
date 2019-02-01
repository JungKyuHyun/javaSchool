
public class Ex05_DataType {
	public static void main(String[] args) {
		// 안에 선언되는 변수 지역변수 (main 함수 안쪽)
		
		byte b = 100;
		System.out.println(b);
		
		int i = 12345;
		System.out.println(i);
		
		long l = 10000000000l; // 정수 리터럴은 int
		
		float f = 3.14f; // 실수 리터럴은 double
		
		double d = 3.141592;
		
		boolean bo = true;
		
		char ch = 'A';
		
		String str = "홍길동";
		
		//Tip) Java 특수문자 사용:   \ 역슬래시
		
		char sing = '\''; // "내가 입력한 것은 값이야"라고 인식시켜줘야함
		
		System.out.println(sing);
		
		//홍"길"동 >> 자체를 데이터(값)
		
		String name = "홍\"길\"동";
		System.out.println(name);
		
		//화면에 C:\Temp라는 문자열을 출력해 보세요
		
		String add = "C:\\Temp";
		System.out.println(add);
		
		System.out.println(System.getProperty("user.dir"); //??????????
		
		
		
	}

}
