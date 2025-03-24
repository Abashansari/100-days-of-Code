//-----------Creating a Constructor----------------------
class Student {
	String name;

	Student() {      //non-parameter Constructor
	}
}
public class Main {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Abash";
		System.out.println(s1.name);
	}
}