package co.sy;

import java.util.Random;

public class StudentMain {

	public static void main(String[] args) {
		String name[] = {"ȫ�浿","��浿","�ڱ浿","�̱浿","�ֱ浿"};
		int age[] = {20, 25, 30, 35, 40};
		char gender[] = {'��','��'};
		String address[] = {"�뱸�� ���� �ž�4��","����� ���� �ž�4��",
				"�λ�� ���� �ž�4��","��õ�� ���� �ž�4��","���ֽ� ���� �ž�4��"};
		
		Student s[] = new Student[10];
		Random r = new Random();
		for (int i = 0; i < s.length; i++) {
			System.out.println(i+1);
			s[i] = new Student(name[r.nextInt(5)],
			         age[r.nextInt(5)],
			         gender[r.nextInt(2)],
			         address[r.nextInt(5)]);
			s[i].showStudentInfo();
							
			
		}
		
		

	}

}
