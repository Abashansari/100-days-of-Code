//Q. Make a function to add two number.
import java.util.Scanner;
public class Main {
	public static int sum(int a , int b){
	   int sum = a+b;
	    System.out.println("The sum of"+a+"and"+b+"is :"+sum);
	    return a+b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a first number :");
		int a = sc.nextInt();
		System.out.print("Enter a second number:");
		int b = sc.nextInt();
		int result= sum(a,b);
	}
}