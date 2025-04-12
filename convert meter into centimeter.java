import java.util.Scanner;
public class Main {
	public static void meterToCentimeter(float meter) {

		// preforming operations to convert into centimeter
		float centimeter = meter * 100;

		//printing the values......
		System.out.print(meter + " meter is equal to: " + centimeter + " cm.");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the meter : ");
		float meter = sc.nextInt();

		//Calling the function...
		meterToCentimeter(meter);
	}
}