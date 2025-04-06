import java.util.Scanner;
class LargerNumber {
	float x;
	float y;
	public void printlargerValue() {
		double result = Math.max(x, y);
		System.out.println("The larger number that you had entered is : " + result);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LargerNumber l1 = new LargerNumber();
		System.out.print("Enter the first number :");
		l1.x = sc.nextFloat();
		System.out.print("Enter the second number :");
		l1.y = sc.nextFloat();
		l1.printlargerValue();

	}
}