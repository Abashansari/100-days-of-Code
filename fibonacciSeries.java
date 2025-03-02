import java.util.*;
public class Main {
	public static void fibonacciSeries(int num) {
		int num1 = 0 ;
		int num2 = 1;

		System.out.println("The fibonacci series of " + num + " is :");
		System.out.print(num1 + " " + num2);

		for (int i = 2; i <= num; i++) {
			int fib = num1 + num2;
			System.out.print(" " + fib);
			num1 = num2;
			num2 = fib;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = sc.nextInt();
		fibonacciSeries(num);

	}
}