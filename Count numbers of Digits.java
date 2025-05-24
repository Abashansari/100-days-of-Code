import  java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numbers of digits : ");
		int n = sc.nextInt();
		int digits = (int)Math.log10(n) + 1;
		System.out.println("The total number of Digits that you have entered is : "+digits);
	}
}