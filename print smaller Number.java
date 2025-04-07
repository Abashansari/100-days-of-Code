import java.util.Scanner;
class SmallerNumber {
	float x;
	float y;
	public void printSmallerValue() {
		double result = Math.min(x, y);
		System.out.println("The smaller number that you had entered is : " + result);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SmallerNumber s1 = new SmallerNumber();
		System.out.print("Enter the first number :");
		s1.x = sc.nextFloat();
		System.out.print("Enter the second number :");
		s1.y = sc.nextFloat();
		s1.printSmallerValue();

	}
}