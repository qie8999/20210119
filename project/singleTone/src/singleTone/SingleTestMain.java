package singleTone;

public class SingleTestMain {

	public static void main(String[] args) {
		// �ν��Ͻ� ��ü ����
		System.out.println("-----------------------");
		System.out.println("�ν��Ͻ� ��ü ����");
		System.out.println("-----------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println(new SingleTest().getData());

		}
		
		
		// singleTone ���
		// �̱���(�ѹ� ������� ��ü ����)
		System.out.println("-----------------------");
		System.out.println("�̱��� ��ü ����");
		System.out.println("-----------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println(SingleTest.getInstance().getData());

		}
	}

}
