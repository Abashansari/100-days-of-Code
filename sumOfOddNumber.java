import java.util.Scanner;
public class Main {
	public static void sumOfOddNumber(int a) {
		int sum = 0;
		for (int i = 1; i <= a ; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		//Calling function
		sumOfOddNumber(a);
	}
}