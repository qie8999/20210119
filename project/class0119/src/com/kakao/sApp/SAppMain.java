package com.kakao.sApp;

import java.util.Random;

public class SAppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] = { "홍길동", "김길동", "박길동", "이길동", "최길동" };
		int age[] = { 20, 25, 30, 35, 40 };
		char gender[] = { '남', '여' };
		String address[] = { "대구시 동구 신암4동", "서울시 동구 신암4동", "부산시 동구 신암4동", "인천시 동구 신암4동", "광주시 동구 신암4동" };

		Student2 st[] = new Student2[10];
		
		
		Random r = new Random();
		for (int i = 0; i < st.length; i++) {
			System.out.println("번호 : " + (i+1));
			st[i] = new Student2(name[r.nextInt(5)], 
					age[r.nextInt(5)], 
					gender[r.nextInt(2)], 
					address[r.nextInt(5)]);
	st[i].showStudentInfo();
	
//	st[9].showStudentInfo(); 열번째 인포에 접근
					
	
//	for (int i = 0; i < st.length; i++) {
//		
//		new Student2(name[r.nextInt(5)], 
//				age[r.nextInt(5)], 
//				gender[r.nextInt(2)], 
//				address[r.nextInt(5)]);
//st[i].showStudentInfo();
//	}
	
	//새로운 객체를 다시 만듦
	//홍길동의 10번째를 없애고 새로 연결
	st[9]=  new Student2("전우치",24,'남',"조선 한양 인근두메산골");
	st[9].showStudentInfo();
	System.out.println("------------------------------------");
	
	//기존의 객체를 재사용(싱글톤) -> 많이 쓰임
	st[9].setName("전우치"); 
	st[9].setAge(24);
	st[9].setGender('남');
	st[9].setAddress("조선 한양 인근두메산골");
	st[9].showStudentInfo();
	
 		}

	}
}