import java.util.Scanner;
public class Main {
	public static void speed(float distance, int time) {
		float speed = distance / time;
		System.out.print("The speed of an object is " + speed + "m/sec");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the distance in METRES : ");
		float distance = sc.nextFloat();
		System.out.print("Enter the time in SECONDS : ");
		int time = sc.nextInt();
		speed(distance, time);
	}
}