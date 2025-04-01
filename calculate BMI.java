import java.util.Scanner;
public class Main {
	public static void bmi(float height, float weight) {
		float bmi = weight % height;
		System.out.println("your Body Mass Index is : " + bmi);
		if (bmi < 18.5) {
			System.out.println("Under Weight");
		} else if (bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("Normal weight");
		} else if (bmi >= 25.0 && bmi <= 29.9) {
			System.out.println("Over Weight");
		} else if (bmi >= 30.0) {
			System.out.println("Obese");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your height in metres : ");
		float height = sc.nextFloat();
		System.out.println("Enter your weight in kg : ");
		float weight = sc.nextFloat();
		bmi(height, weight);
	}
}