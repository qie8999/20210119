package com.sy.carApp;

public class Customer {
	private String name;
	private String tel;
	private String address;
	private Car car;
	private static Customer inst;

	public Customer(String name, String tel, String address, Car car) {
		super();
		this.name = name;
		this.tel = tel;
		this.address = address;
		this.car = car;
	}

	public static Customer getInstance(String name, String tel, String address, Car car) {
		if (inst == null) {
			inst = new Customer(name, tel, address, car);
		}
		return inst;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void printCustomerInfo() {
		System.out.println("���� : " + name);
		System.out.println("��ȭ : " + tel);
		System.out.println("�ּ� : " + address);
		car.printCarInfo();

	}

}
