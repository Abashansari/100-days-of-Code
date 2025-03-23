//----------------------Ternary Operator---------------------->
import java.util.Scanner;
class Ternary {
	int age;
	public  void printMessage(int age) {
		this.age = age;
		String msg = (age >= 18) ? "you are Adult" : "you are child";
		System.out.println(msg);
	}
}

public class main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your age :");
		int age = sc.nextInt();

		Ternary t1 = new Ternary();
		t1.printMessage(age);
	}
}
