import java.util.Scanner;
public class Main {

	public static void PythagoreanTheorem(int perpendicular, int base) {

		// preforming operations for hypotenuse
		int a = perpendicular * perpendicular;
		int b = base * base;
		int c = a + b;
		double hypotenuse = Math.sqrt(c);

		// preforming operations for Area..
		int ab = perpendicular * base;
		double half = 0.5; // 1/2 is equal to 0.5
		double area = half * ab;

		//printing the values......
		System.out.print("Hence, the length of hypotenuse is : " + hypotenuse + " cm.");
		System.out.println("And the Area  is : " + area);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Perpendicular : ");
		int perpendicular = sc.nextInt();
		System.out.print("Enter the Base : ");
		int base = sc.nextInt();

		//Calling the function...
		PythagoreanTheorem(perpendicular, base);
	}
}