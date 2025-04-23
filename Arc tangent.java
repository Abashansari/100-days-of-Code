import java.util.Scanner;
class ATan {
	double a;
	public void printResult() {
		double result = Math.atan(a);
		System.out.println("The tangent of x (angle in radians) is  : " + result);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ATan t1 = new ATan();
		System.out.print("Enter the  number :");
		t1.a = sc.nextDouble();
		t1.printResult();
	}
}