package com.csy.carApp.car;

public class Car {
	private String model;
	private int year;
	private String color;
	private String company;
	private String price;
	
	//�Ű������� ����ϴ� ������
	public Car(String model, int year, String color, String company, String price) {
		super();
		this.model = model;
		this.year = year;
		this.color = color;
		this.company = company;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	public void printCarInfo() {
		System.out.println("������ : " + company);
		System.out.println("�� : " + model);
		System.out.println("���� : " + color);
		System.out.println("���� : " + price);
		System.out.println("���� : " + year);
	}

}
