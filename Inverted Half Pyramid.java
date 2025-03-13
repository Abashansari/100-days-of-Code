//Q. pattern of Inverted Half Pyramid.
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number for Inverted Half Pyramid: ");
		int n= sc.nextInt();
		for( int i = 1; i <= n; i++){
		    for( int j =n; j > i ; j--){
		        System.out.print("*");
		    }
		    System.out.println("*");
		}
	}
}