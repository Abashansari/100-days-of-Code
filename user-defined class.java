import java.util.Scanner;
class Student {
	String name;
	int age;
	public void getInfo() {
		System.out.println("The name of Student is : " + name);
		System.out.println("The age of Student is : " + age);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		System.out.print("Enter your name :");
		s1.name = sc.nextLine();
		System.out.print("Enter you age :");
		s1.age = sc.nextInt();
		s1.getInfo();
	}
}