import person.Person;
import person.Student;
import person.Teacher;

public class Main {

	public static void main(String[] args) {
		
		Person p1 = new Person("Jan", "Kowalski", "M");
		
		Student s1 = new Student("Mateusz", "Kowalski", "M", "s12000");
		
		Teacher t1 = new Teacher("Basia", "Malinowska", "K", "Informatyka");

		System.out.println(p1.introduce());
		
		Person p2 = new Teacher("Kuba", "Kowalski", "M", "Programowanie");
		
		Person p3 = new Student("Ania", "Malinowska", "K", "A0000");
		
		System.out.println(p2.introduce());
		System.out.println(p3.introduce());
		
		
		
		Figura f1 = new Kwadrat(5);
		
		System.out.println(f1.toString());
		
		Figura f2 = new Kolo(5);
		System.out.println(f2.toString());
		
		

	}

}
