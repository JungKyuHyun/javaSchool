//������
public class Ex06_Operation {
	public static void main(String[] args) {
		int result = 100/100;
		System.out.println(result);
		
		result = 13/2;
		System.out.println(result);
		
		result = 13%2;
		System.out.println(result); //������ 
		
		//������ ������(++, --) 1�� �����ϰų� 1�� ����
		int i = 10;
		++i; //��ġ ����
		System.out.println(i);
		i++; //��ġ ����
		System.out.println(i);
		// ���� 1�� : ��ġ, ��ġ ����
		
		//POINT : ��ġ�� ��ġ �����ڴ� �����ϸ� ������ ....!!!
		int i2 = 5;
		int j2 = 4;
		
		int result2 = i2 + ++j2;
		System.out.println(result2); //j2 1���� ��Ű�� + ����
		
		// ���� i2 = 5, j2 = 5
		result2 = i2 + j2++;
		System.out.println(result2);
		// ���� i2 =5, j2=6
		System.out.println("i2 ���� : " + i2 + "," + "j2 ���� : " + j2);
		
		//POINT
		//�ڹ��� ���� ��Ģ
		//������ ��� [����]�� int�� ��ȯ �� ó��
		//byte + byte => �����Ϸ��� int + int �� �����Ѵ�. ==>> ����� byte+ byte�� int�� �޾ƾ��Ѵ�.
		
		byte b = 100; // -128 ~ 127
		byte c = 1;
//		byte d = b + c; // �̷��� ����!!
		int d = b  + c;
		System.out.println(d);
		
		//1. byte d = (byte)(b+c); ĳ�����ؼ� �Ϻθ� ����/������ ���� �߻� ����/�ϴ� 101 ���ڰ� 1byte ǥ�� �����ؼ� �������...
		//2. int d = b+c; 
		
		//byte + short = int + int
		//char + char = int + int
		//POINT : ���꿡 int ���� ���� Ÿ���� int������ ��ȯ�� ó��(�� long ����, int���� ũ�� ����)
		//byte, char, short -> int �ٲپ ���� ó��
		
		//int + long = long + long >> ��� long
		
		// ������ �Ǽ� >> �Ǽ�(����Ʈ ũ�Ⱑ ������ ������ �Ǽ��� �̱�)
		//float + int = float + float >> ��� float
		//long + float = float + float >> ��� float
		//float + double = double + double >> ��� double
	}

}
