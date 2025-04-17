import java.util.Scanner;
class Sin {
	double a;
	public void printResult() {
		double result = Math.sin(a);
		System.out.println("The sin of an angle is  : " + result);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sin s1 = new Sin();
		System.out.print("Enter the  number :");
		s1.a = sc.nextDouble();
		s1.printResult();
	}
}