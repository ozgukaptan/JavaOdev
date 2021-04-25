package javaOdev;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.id = 1;
		student1.firstName = "ozgu";
		student1.lastName = "kaptan";
		student1.email = "eposta";
		student1.password = "password";

		Student student2 = new Student(1,"ozgu1","kaptan2","email","password2");
		
		Student[] studends = {student1,student2};
		
		for (Student student : studends) {
			System.out.println(student.firstName);
		}
	}

}
