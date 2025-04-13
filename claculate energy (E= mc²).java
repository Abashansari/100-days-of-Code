import java.util.Scanner;
public class Main {
	public static void energy(float mass, float light) {
		float mc = mass * light;
		float energy = mc * mc;
		System.out.print("Therefore,The energy is :" + energy + "joule (J)");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the mass :");
		float mass = sc.nextFloat();
		System.out.print("Enter the speed of light :");
		float light = sc.nextFloat();
		energy(mass, light);

	}
}