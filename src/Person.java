// 라인주석
// 설계도(속성 + 기능)
public class Person {
	private int age; //사람은 나이를 가지고 있다 (나이 정보를 담는 공간)
	private String name; // 사람은 이름을 가지고 있다

	public Person() { //기본생성자(특수한 함수)
		//객체 생성과 동시에 호출되는 함수
	}
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	//테스트
	public void PersonInfo() {
		System.out.println("정보:" + this.name + "," + this.age);
	}
}
