//Q. Inverted Half pyramid (rotated by 180 degree.)
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number to print Inverted pyramid (rotated by 180 degree):");
	    int n = sc.nextInt();
	    
		for(int i = 1; i <= n ; i++){
		  // for printing space
		      for(int j = 1; j <= n-i ; j++){
		          System.out.print(" ");
		      }
		      //for printing * astrick
		      for(int k = 1; k <= i; k++){
		          System.out.print("*");
		      }
		      System.out.println(" ");
		}	
	}
}