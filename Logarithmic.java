import java.util.Scanner;
class Logarithmic {
	double a;
	public void printResult() {
		double result = Math.log(a);
		System.out.println("The natural logarithm (base e) of the given number is  : " + result);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Logarithmic l1 = new Logarithmic();
		System.out.print("Enter the  number :");
		l1.a = sc.nextDouble();
		l1.printResult();
	}
}
