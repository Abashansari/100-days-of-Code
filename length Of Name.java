import java.util.Scanner;
class Name {
	String name;
	public void lengthOfName() {
		int length = name.length();
		System.out.println("The length of your name is :" + length);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Name n1 = new Name();
		System.out.print("Enter your Name : ");
		n1.name = sc.nextLine();
		n1.lengthOfName();
	}
}