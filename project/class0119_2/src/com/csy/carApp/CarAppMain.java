package com.csy.carApp;

import java.util.Random;

import com.csy.carApp.car.Car;
import com.csy.carApp.customer.Customer;

public class CarAppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] = { "ȫ�浿", "�ڱ浿", "�̱浿", "�ֱ浿", "��浿" };
		String tel[] = { "010-1234-5678", "010-4321-5678", "010-3478-1278", "010-4523-1978", "010-7890-2134" };
		String address[] = { "�뱸�� ���� �ž�4��", "����� ���� �ž�4��", "�λ�� ���� �ž�4��", "��õ�� ���� �ž�4��", "���ֽ� ���� �ž�4��" };
		String model[] = { "SM6", "�ҳ�Ÿ", "��Ÿ��", "K7", "�׷���" };
		String color[] = { "����", "����", "���", "ȸ��", "����" };
		int year[] = { 2021, 2020, 2019, 2018, 2017 };
		String company[] = { "����Ｚ", "����", "���", "�ֿ�", "GM" };
		String price[] = { "2õ���鸸��", "3õ����", "3õ���鸸��", "4õ����", "4õ���鸸��" };

		Customer[] cu = new Customer[10];
		Random r = new Random();
		for (int i = 0; i < cu.length; i++) {
			System.out.println("��ȣ : " + (i+1));
			cu[i] = new Customer(name[r.nextInt(5)], 
						tel[r.nextInt(5)], 
						address[r.nextInt(5)],					
					new Car(model[r.nextInt(5)], 
						year[r.nextInt(5)], 
						color[r.nextInt(5)], 
						company[r.nextInt(5)],
						price[r.nextInt(5)]));
			cu[i].printCustomerInfo();
		}

	}

}