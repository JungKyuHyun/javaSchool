// �����ּ�
// ���赵(�Ӽ� + ���)
public class Person {
	private int age; //����� ���̸� ������ �ִ� (���� ������ ��� ����)
	private String name; // ����� �̸��� ������ �ִ�

	public Person() { //�⺻������(Ư���� �Լ�)
		//��ü ������ ���ÿ� ȣ��Ǵ� �Լ�
	}
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	//�׽�Ʈ
	public void PersonInfo() {
		System.out.println("����:" + this.name + "," + this.age);
	}
}
