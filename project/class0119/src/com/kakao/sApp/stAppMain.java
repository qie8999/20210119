package com.kakao.sApp;

import java.util.Random;

public class stAppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] = { "홍길동", "김길동", "박길동", "이길동", "최길동" };
		int age[] = { 20, 25, 30, 35, 40 };
		char gender[] = { '남', '여' };
		String address[] = { "대구시 동구 신암4동", "서울시 동구 신암4동", "부산시 동구 신암4동", "인천시 동구 신암4동", "광주시 동구 신암4동" };

		Student st[] = new Student[10];
		Random r = new Random();
		for (int i = 0; i < st.length; i++) {
			System.out.println("번호 : " + (i+1));
			st[i] = 
					new Student(name[r.nextInt(5)], 
							age[r.nextInt(5)], 
							gender[r.nextInt(2)], 
							address[r.nextInt(5)]);
			st[i].showStudentInfo();

 		}

	}

}
