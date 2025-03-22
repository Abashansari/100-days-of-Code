//----------------Taking size of an Array------------------>
import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an Array :");
		int size = sc.nextInt();
		//Declaring array
		int [] arr = new int [size];
		
		System.out.println("Size of the array is :"+size);
		System.out.println("And the value store in its is :\n"+arr);
		
	}
}