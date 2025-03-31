import java.util.Scanner;
public class Main {
	public static void areaRectangle(int l, int w) {
		int a = l * w;
		System.out.println("The area of the rectangle is : " + a);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of rectangle : ");
		int l = sc.nextInt();
		System.out.print("Enter the width of rectangle : ");
		int w = sc.nextInt();
		areaRectangle(l, w);
	}
}