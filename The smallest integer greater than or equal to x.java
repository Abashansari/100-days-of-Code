import java.util.Scanner;
class Ceil {
	double x;
	public void printResult() {
		double result = Math.ceil(x);
		System.out.print("The smallest integer greater than or equal to " + x + " is : " + result);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ceil c1 = new Ceil();
		System.out.print("Enter a number :");
		c1.x = sc.nextDouble();
		c1.printResult();
	}
}