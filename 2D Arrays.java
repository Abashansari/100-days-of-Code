import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row & coloum of array :");
		int row = sc.nextInt();
		int coloum = sc.nextInt();
//	 int number[] [];
		int marks[][] = new int[row][coloum];
		//for input
		for (int i = 1; i <= row ; i++) {
			for (int j = 1; j <= coloum; j++) {
				marks[i][j] = sc.nextInt();
				System.out.print(marks[i][j] + " ");
			}
		}
		// for output
		/*	for(int i = 1; i <= row ; i++){
		for(int j = 1; j <= coloum; j++){
		    System.out.print(marks[i][j] + " ");
		    }
		    System.out.println();
		}*/
	}
}