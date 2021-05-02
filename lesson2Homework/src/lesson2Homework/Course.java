package lesson2Homework;

public class Course {
	int id;
	String name;
	int time;
	String type;

	public Course() {
			
			System.out.println("Kurs metodu çalýþtýrýldý.");
	}
	
	public Course(int id,String name,int time,String type) {
		
			this.id=id;
			this.name=name;
			this.time=time;
			this.type=type;
			
	}
	
}
