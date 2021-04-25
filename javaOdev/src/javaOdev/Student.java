package javaOdev;

public class Student {

	public Student() {
		System.out.println("paremetre almayan kurucu metod çalýþtý????");
	}

	public Student(int id, String firstName,String lastName, String email, String password) {
		this();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	int id;
	String firstName;
	String lastName;
	String email;
	String password;
}
