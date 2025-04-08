import java.util.Scanner;
class Floor {
	float x;
	public void printResult() {
		double result = Math.floor(x);
		System.out.println("The largest integral value less than or equal to the specified double-precision floating-point number is  : " + result);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Floor f1 = new Floor();
		System.out.print("Enter the  number :");
		f1.x = sc.nextFloat();
		f1.printResult();
	}
}
