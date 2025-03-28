import java.util.Scanner;
class Cube {
	int num;
	public void cube() {
		int result = num * num * num;
		System.out.println("The cube of " + num + " is : " + result);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cube c1 = new Cube();
		System.out.print("Enter a number :");
		c1.num = sc.nextInt();
		c1.cube();
	}
}