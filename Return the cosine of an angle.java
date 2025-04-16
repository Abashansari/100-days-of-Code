import java.util.Scanner;
class Cos {
	double a;
	public void printResult() {
		double result = Math.cos(a);
		System.out.println("The cosine of an angle is  : " + result);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cos c1 = new Cos();
		System.out.print("Enter the  number :");
		c1.a = sc.nextDouble();
		c1.printResult();
	}
}
