//Q. pattern of Half Pyramid with number.

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number for half pyramid with number : ");
	int n = sc.nextInt();
	for(int i = 1; i <= n ; i++){
	    for(int j = 1; j < i; j++){
	        System.out.print(j+" ");
	        }
	        System.out.println(i);
	        }	
	}
}