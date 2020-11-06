package application;

import java.io.Serializable;

public class Person implements Serializable
{
	private static final long serialVersionUID = 1L;
	private int age;
	private String name;
	private String surname;
	private String number;
	private String address;
	
	public Person(int age, String name, String surname, String number, String address) {
		super();
		this.age = age;
		this.name = name;
		this.surname = surname;
		this.number = number;
		this.address = address;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", surname=" + surname + ", number=" + number + ", address="
				+ address + "]";
	}
	
	
	
}
