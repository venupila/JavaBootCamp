package lesson2Homework;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Course course1 = new Course(1,"Java & React",40,"Programlama");

		Course course2 = new Course();
		
		course2.id = 2;
		course2.name = "C# & Angular";
		course2.time = 60;
		course2.type = "Programlama";
		

		Instructor instructor1 = new Instructor(1,"Engin","Demiroğ","Java dersi veriyor.");

		Instructor instructor2 = new Instructor();
		
		instructor2.id = 2;
		instructor2.name = "Ahmet";
		instructor2.surname = "Test";
		instructor2.detail = "C# dersi veriyor.";
		
		
		CourseManager courseManager =new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);
		courseManager.AddToInstructor(instructor1);
		courseManager.AddToInstructor(instructor2);
		
		
		
		
		
	}

}
