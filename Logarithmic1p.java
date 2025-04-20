import java.util.Scanner;
class Logarithmic1p {
	double a;
	public void printResult() {
		double result = Math.log1p(a);
		System.out.println("The natural logarithm  of the given number(i.e, 1+a)is  : " + result);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Logarithmic1p l1 = new Logarithmic1p();
		System.out.print("Enter the  number :");
		l1.a = sc.nextDouble();
		l1.printResult();
	}
}
