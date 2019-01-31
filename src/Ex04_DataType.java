/*
 * �ڹٴ� �ý��ۿ��� �⺻������ �����ϴ� 8���� �⺻ Ÿ���� ������ �ִ�
 * 8���� �⺻ Ÿ���� ���� �����Ѵ�.
 * Tip) [��]�� [�ּҰ�]�� ������ �� �ִ�.
 * 
 * ���� -> ����(���� ����, 0 , ���� ����) -> byte(-128~127)
 * 										  -> char(�� ���ڸ� ǥ���ϴ� �ڷ���: �� ���ڴ� 2byte), unicode
 * 										  -> short ... (c����� ȣȯ��)
 * 										  -> int(-21�� ~ 21��)**java ���� ������ �⺻ Ÿ��
 * 										  -> long(8byte) int���� ū ��
 * 		
 * 		-> �Ǽ�(�ε� �Ҽ���) 			  -> float(4byte), double(8byte)
 * 										  -> double�� ���е��� ����(ǥ�� ������ ũ��)
 * 										  -> double�� java �Ǽ� ���� �⺻Ÿ��
 * 		
 * 		-> boolean(true, false)           -> ���α׷��� �� ����
 * 
 * Q) ���ڿ��� ǥ��(ex "ȫ�浿 �ȳ��ϼ���")
 * String�� Ŭ���� : String s = new String("�ȳ��ϼ���");
 * �� ���� : String s = "�ȳ��ϼ���";
 * String ���ؼ� ������ ����� �ֱ������ String�� intó�� ������.
 * 
 * �� Ÿ��: �޸𸮿� ��(����,��)�� �������
 * ���� Ÿ��: �޸𸮿� ��(Ŭ����, �迭)�� �ּ�(����)�� �������
 * 
 * class == ���赵 == Ÿ��(Type)
 * class�� ���� Ÿ���� ��� ���� ū Ÿ��
 * 
 * class�� �ݵ�� �޸𸮿� �÷����� ���(new)
 */

//�ּ��� ���Ե���� �ҷ���, [�Ӽ�(��������)] + [����(���)]�� ������ �־�� �Ѵ�. -> �̰��� ������!
class Car{
	String color; //������ ��ڴ�!!
	int window;   //�������� â�� ����
}

public class Ex04_DataType {
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println("c��� ������ ��: " + c); //Car@5c8da962 �ּҰ�(����) >> ���� Ÿ��
		
		Car c2;
		c2 = c; // new�� ���� �ּҰ��� �Ҵ��� ���� new�� �� �ᵵ �ȴ�.
		System.out.println(c==c2);
		
		Car c3;    // ����
		c3 = new Car(); //�Ҵ�
		System.out.println("c3��� ������ ��: " + c3);
		c3.color ="gold";
		c3.window =10;
		System.out.println(c3.color + ":" + c3.window);
		
		int i = 200;
		System.out.println(i); //200 >> �޸� �ȿ� ���� 200
		
		int j; //����
		j = 1000;
		
		int a, b; // �ݵ�� �ʱ�ȭ
		a=10; 
		b=20;
		
		int k = 1111;
		int k2 = k;
		k=2222;
		
		//int(-21 ~ 21 )
		//int number = 10000000000; //����(������ ����)
		// ���� ���ͷ��� ǥ�� ������ int ���� (Today Point)
		// ���� ���ͷ� >> ǥ�� ���ڰ�
		// ���̻� L
		long number = 10000000000000L; // ���� ���ͷ� ���� long���� ����
		System.out.println("long Ÿ�� : " + number);
		
		//char : ���� ���� ������ �ִ�(2byte)
		//���ڸ� ǥ���ϴ� Ÿ��
		//1. �� ���� > 2byte ����
		//2. �ѱ� �� �� : 2byte
		//3. ������, ����, Ư������, ���� : 1byte
		// but, �ѱ��̳� ���� ��� �� �Ѱ��� ���� ǥ���� 2byte��!
		
		//java ���ڿ� : " " (String s = "��")
		//java ����(�� ����) : ' ' (char c = '��')
		
		char single = '��';
		System.out.println(single);
		
		char ch = 'A';
		System.out.println((int)ch); //casting Ÿ�Ժ�ȯ // �ƽ�Ű �ڵ�ǥ 10������
		// A:65 , a:97
		
		char ch1 = 'a';
		System.out.println((int)ch1);
		
		int ch2 = 65;
		System.out.println((char)ch2);// ����� ����ȯ
		
		int cint = ch; //�Ͻ��� ����ȯ // ����� �����Ϸ��� (int) ch;
		
		/*
		 * Today Point
		 * 
		 * ������ ������ �ִ� [���� ���� ����] [������ Ÿ��]�� ������
		 * Ÿ���� ũ�⸦ ����
		 * ū Ÿ�Կ��� ���� Ÿ�� ���� ���� �� �ִ�.
		 * ���� Ÿ�Կ��� ū Ÿ�� ���� ���� �� ����.
		 * 
		 */
		
//		int intvalue = 103029970;
//		byte bytevalue = (byte)intvalue; // ���� ������! �սǹ߻�(������ �ȳ���, �����ؼ� �սǳ��� ������ ��)
//		System.out.println(bytevalue); // �����Ⱚ
		
		int intvalue = 10;
		byte bytevalue = (byte)intvalue; //10�� byte������ �� byte�� ��ȯ�ص� �ս��� �߻����� ������,
		System.out.println(bytevalue); 		// �Ϲ������� �츮�� ������ �� ���⶧���� ������� ����
		
		//String (���ڿ�) Ÿ��
		
		//POINT : String �Ϲ� �� Ÿ��ó�� �ᵵ ���� ������ ����. �ٸ� String�� �����Ǹ� 
		// �� �޸𸮿� ��� �޸𸮸� �����ϹǷ�(���α׷��� ������� �ʴ� �̻� ���� �ȵ�) ������ 
		// ���� ����߸���. StringBuilder �÷��� ���� ����ؾ� ��.
		
		//010-8360-5668
		
		String str3 = "1000";
		String str4 = "10";
		
		String result = str3 + str4; // + >> ���ڿ� + ���ڿ�(���տ�����)
		System.out.println(result);
		
		System.out.println("100"+ 100); // 100100 
		System.out.println("0"+100);
		System.out.println(100+100+"100");
		String result1 = "0" + 100;
		System.out.println(Integer.parseInt(result1)); // ���ڸ� ������ �ٲٴ� ��
		
		
		/*
		 *  �Ǽ�(�ε��Ҽ���)
		 *  float(4byte)
		 *  double(8byte) ** �Ǽ��� �⺻ ���ͷ��� double (���е��� ����: �Ҽ��θ� �� ���� ǥ��)
		 */
		
		float f = 3.14f; // ���̻� (F, f)
		float f2 = 1.123456789f;
		System.out.println(f2); //1.1234568 // �ݿø�ó�� 7�ڸ� ǥ��
		
		double d = 1.123456789123456789; // �ݿø�ó�� 16�ڸ� ǥ��
		System.out.println(d);
		
		double d2 = 100;
		System.out.println(d2);
		//�����Ϸ��� ���������� ����ȯ�� ��(�Ͻ��� ����ȯ) double d2 = (double) 100;
		
		//1234125 >> ���� ���ͷ��� ������ : int
		// 1.213124 >> �Ǽ� ���ͷ��� ������ : double
		
		//Quiz
		double d3 = 100;
		int i5 = 100;
		
		//int result2 = d3 + i5;
		//1.������ �ս� ���� ���� �� �ִ�
//		double result2 = d3 + i5; 
		
		//2. ������ ���� �� ������, ���� �ս� �� �� �ִ�.
//		int result2= (int)d3 + i5; // 
		
		//3. ���� �սǵ� �� �ִ�.
		int result2 = (int)(d3 + i5);
		
		//Today Point
		//���� Ÿ�� + ū Ÿ�� => ū Ÿ��
		// int + double = double
		// int + short = int
		// Ÿ�԰� ����ȯ>> ������ ������ ���� ���� ���� ������ Ÿ������ �Ǵ�����.
		
		int i6 =100;
		byte b2 = (byte)i6; // ������ �ս��� �Ͼ �� �ִ�. �����ϸ� "���� Ÿ�� + ūŸ��"�� ��� ū
								//Ÿ������ ����
		System.out.println(i6);
		
		byte b3 = 20;
		int i7 = b3; // ���� ���� ū �Ϳ� �ִ� �� ��� ������, ����� �����Ϸ���
					// int i7 = (int)b3; >> casting
	}

}
