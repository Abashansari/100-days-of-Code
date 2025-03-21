//-----------Creating a Constructor----------------------
class Student {
	String name;
	// Parameter Constructor
	Student(String name) {
		System.out.println(name);
	}

}
public class Main {
	public static void main(String[] args) {
		Student s1 = new Student("Abash Ansari");
	}
}