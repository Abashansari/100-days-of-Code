import java.util.Scanner;
class Cosh {
	double a;
	public void printResult() {
		double result = Math.cosh(a);
		System.out.println("The hyperbolic cosine of x is  : " + result);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cosh c1 = new Cosh();
		System.out.print("Enter the  number :");
		c1.a = sc.nextDouble();
		c1.printResult();
	}
}
