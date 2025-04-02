import java.util.Scanner;
class Metre {
	float cm;
	public void convertCentimetreToMetre() {
		float  metre = cm / 100;
		System.out.println(cm + " centimetre = " + metre + " metre.");
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Metre m1 = new Metre();
		System.out.print("Enter a number in Centimetre :");
		m1.cm = sc.nextFloat();
		m1.convertCentimetreToMetre();
	}
}