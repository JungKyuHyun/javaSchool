
public class Ex05_DataType {
	public static void main(String[] args) {
		// �ȿ� ����Ǵ� ���� �������� (main �Լ� ����)
		
		byte b = 100;
		System.out.println(b);
		
		int i = 12345;
		System.out.println(i);
		
		long l = 10000000000l; // ���� ���ͷ��� int
		
		float f = 3.14f; // �Ǽ� ���ͷ��� double
		
		double d = 3.141592;
		
		boolean bo = true;
		
		char ch = 'A';
		
		String str = "ȫ�浿";
		
		//Tip) Java Ư������ ���:   \ ��������
		
		char sing = '\''; // "���� �Է��� ���� ���̾�"��� �νĽ��������
		
		System.out.println(sing);
		
		//ȫ"��"�� >> ��ü�� ������(��)
		
		String name = "ȫ\"��\"��";
		System.out.println(name);
		
		//ȭ�鿡 C:\Temp��� ���ڿ��� ����� ������
		
		String add = "C:\\Temp";
		System.out.println(add);
		
		System.out.println(System.getProperty("user.dir"); //??????????
		
		
		
	}

}
