package lesson2Homework;

public class Instructor {
	int id;
	String name;
	String surname;
	String detail;

	public Instructor() {
			
			System.out.println("Eğitmen metodu oluşturuldu.");
	}
	
	public Instructor(int id,String name,String surname,String detail) {
			
			this.id=id;
			this.name=name;
			this.surname=surname;
			this.detail=detail;
	}
}
