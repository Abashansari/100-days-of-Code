import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int x = sc.nextInt();
		int y = ++x;
		System.out.print("The increment of this number is :" + y);
	}
}