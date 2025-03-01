import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of your array : ");
		int size = sc.nextInt();
		int marks[]  = new int [size];

		for (int i = 1; i <= size ; i++) {
			marks[i] = sc.nextInt();
			System.out.println(marks[i]);

		}
	}
}