import java.util.Scanner;
class ACos {
	double a;
	public void printResult() {
		double result = Math.acos(a);
		System.out.println("The trigonometric value of the arc cosine of an angle. is  : " + result);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ACos c1 = new ACos();
		System.out.print("Enter the  number :");
		c1.a = sc.nextDouble();
		c1.printResult();
	}
}
