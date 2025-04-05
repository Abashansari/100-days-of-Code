import java.util.Scanner;
import java.lang.Math;
class CubeRoot {
	float x;
	public void cubeRoot() {
		double result = Math.cbrt(x);
		System.out.println("The cube root is : " + result);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CubeRoot c1 = new CubeRoot();
		System.out.print("Enter the a number :");
		c1.x = sc.nextFloat();
		c1.cubeRoot();

	}
}