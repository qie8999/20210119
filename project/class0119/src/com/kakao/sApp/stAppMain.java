package com.kakao.sApp;

import java.util.Random;

public class stAppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] = { "ȫ�浿", "��浿", "�ڱ浿", "�̱浿", "�ֱ浿" };
		int age[] = { 20, 25, 30, 35, 40 };
		char gender[] = { '��', '��' };
		String address[] = { "�뱸�� ���� �ž�4��", "����� ���� �ž�4��", "�λ�� ���� �ž�4��", "��õ�� ���� �ž�4��", "���ֽ� ���� �ž�4��" };

		Student st[] = new Student[10];
		Random r = new Random();
		for (int i = 0; i < st.length; i++) {
			System.out.println("��ȣ : " + (i+1));
			st[i] = 
					new Student(name[r.nextInt(5)], 
							age[r.nextInt(5)], 
							gender[r.nextInt(2)], 
							address[r.nextInt(5)]);
			st[i].showStudentInfo();

 		}

	}

}