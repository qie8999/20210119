package singleTone;

public class SingleTest {
	private static SingleTest inst;
	//클래스변수
	private int data;
	
	public SingleTest() {
		data = (int)(Math.random()*100);
	}
	
	public static SingleTest getInstance() {
		//이미 만들어진 객체를 불러들임
		if(inst ==null) {
			inst = new SingleTest();
			
		}
		return inst;
	}
	
	public int getData() {
		return data;
	}
}
