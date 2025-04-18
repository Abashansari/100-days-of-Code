import java.util.Scanner;
class Tan {
	double a;
	public void printResult() {
		double result = Math.tan(a);
		System.out.println("The tan of an angle is  : " + result);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tan t1 = new Tan();
		System.out.print("Enter the  number :");
		t1.a = sc.nextDouble();
		t1.printResult();
	}
}