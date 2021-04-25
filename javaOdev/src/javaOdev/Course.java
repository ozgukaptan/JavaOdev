package javaOdev;

public class Course {

	public Course() {
		System.out.println("paremetre almayan kurucu metod çalýþtý");
	}

	public Course(int id,String name,int teacherId ) {
		this();
		this.id = id;
		this.name = name;
		this.teacherId = teacherId;
	}

	int id;
	String name;
	int teacherId;
}
