import java.util.Scanner;
class Sinh {
	double a;
	public void printResult() {
		double result = Math.sinh(a);
		System.out.println("The hyperbolic sine of x is  : " + result);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sinh s1 = new Sinh();
		System.out.print("Enter the  number :");
		s1.a = sc.nextDouble();
		s1.printResult();
	}
}