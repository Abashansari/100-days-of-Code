//Q.Print the pattern of half pyramid.

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number for Half pyramid pattern: "); 
       int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
		    for(int j = 1; j < i ; j++ ){
		        System.out.print("*");
		    }
		    System.out.println("*");
		}
	}
}