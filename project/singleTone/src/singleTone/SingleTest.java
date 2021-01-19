package singleTone;

public class SingleTest {
	private static SingleTest inst;
	//Ŭ��������
	private int data;
	
	public SingleTest() {
		data = (int)(Math.random()*100);
	}
	
	public static SingleTest getInstance() {
		//�̹� ������� ��ü�� �ҷ�����
		if(inst ==null) {
			inst = new SingleTest();
			
		}
		return inst;
	}
	
	public int getData() {
		return data;
	}
}