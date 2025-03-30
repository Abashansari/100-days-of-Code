import java.util.Scanner;
public class Main {
	public static void area(int radius) {
		int r = radius * radius; // here r refers to  r²
		int pi = 22 / 7;
		int area =  pi * r ;
		System.out.println("The area of a circle is : " + area);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of circle : ");
		int radius = sc.nextInt();
		area(radius); //calling function

	}
}