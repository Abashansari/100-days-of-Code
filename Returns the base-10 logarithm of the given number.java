import java.util.Scanner;
class Logarithmic10 {
	double a;
	public void printResult() {
		double result = Math.log10(a);
		System.out.println("The natural logarithm (base 10) of the given number is  : " + result);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Logarithmic10 l1 = new Logarithmic10();
		System.out.print("Enter the  number :");
		l1.a = sc.nextDouble();
		l1.printResult();
	}
}
