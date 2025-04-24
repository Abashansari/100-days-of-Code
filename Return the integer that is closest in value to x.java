import java.util.Scanner;
class Rint {
	double a;
	public void printResult() {
		double result = Math.rint(a);
		System.out.println("The integer that is closest in value to x is  :  " + result);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rint r1 = new Rint();
		System.out.print("Enter the  number :");
		r1.a = sc.nextDouble();
		r1.printResult();
	}
}