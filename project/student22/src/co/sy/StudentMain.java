package co.sy;

import java.util.Random;

public class StudentMain {

	public static void main(String[] args) {
		String name[] = {"홍길동","김길동","박길동","이길동","최길동"};
		int age[] = {20, 25, 30, 35, 40};
		char gender[] = {'남','여'};
		String address[] = {"대구시 동구 신암4동","서울시 동구 신암4동",
				"부산시 동구 신암4동","인천시 동구 신암4동","광주시 동구 신암4동"};
		
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
