import java.util.Scanner;
class ASin {
	double a;
	public void printResult() {
		double result = Math.asin(a);
		System.out.println("The arcsine of x (in radians) is  : " + result);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ASin s1 = new ASin();
		System.out.print("Enter the  number :");
		s1.a = sc.nextDouble();
		s1.printResult();
	}
}