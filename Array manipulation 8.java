import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mul = 0;
		System.out.print("Enter the size of row :");
		int row = sc.nextInt();
		System.out.print("Enter the size of coloum :");
		int coloum = sc.nextInt();
		int [][]intArr = new int [row][coloum];
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= coloum; j++) {
				mul = coloum * row;
				System.out.print(mul + " ");
			}
			System.out.println(" ");
		}
	}
}