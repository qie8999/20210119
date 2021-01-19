package com.sy.carApp;

import java.util.Random;

public class CarAppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] = {"ȫ�浿","��浿","�ڱ浿","�̱浿","�ֱ浿"};
		String tel[] = {"010-1234-5678","010-4321-5678","010-3478-1278","010-4523-1978","010-7890-2134"};
		String address[] = {"�뱸�� ���� �ž�4��","����� ���� �ž�4��",
				"�λ�� ���� �ž�4��","��õ�� ���� �ž�4��","���ֽ� ���� �ž�4��"};
		String model[] = {"SM6","�Ÿ","��Ÿ��","K7","�׷���"};
		String color[] = {"��","����","���","ȸ��","����"};
		int year[] = {2016, 2017, 2018, 2019, 2020};
		String company[] = {"�Ｚ����","����","���","����","�ֿ�"};
		
		Customer cu[] = new Customer[10];
		Random r = new Random();
		
		for (int i = 0; i < cu.length; i++) {
			System.out.print(i+1 + " ");
			cu[i] = new Customer(name[r.nextInt(5)],
			                    tel[r.nextInt(5)],
			                    address[r.nextInt(5)],
					new Car(model[r.nextInt(5)],
							color[r.nextInt(5)],
							year[r.nextInt(5)],
							company[r.nextInt(5)]
							));
					cu[i].printCustomerInfo();;
		}
		
		for (int i = 0; i < cu.length; i++) {
			System.out.print(i+1 + " ");
			cu[i] = Customer.getInstance(name[r.nextInt(5)],
			                    tel[r.nextInt(5)],
			                    address[r.nextInt(5)],
					new Car(model[r.nextInt(5)],
							color[r.nextInt(5)],
							year[r.nextInt(5)],
							company[r.nextInt(5)]
							));
					cu[i].printCustomerInfo();;
		}
		
		
		}

	}

