//Q. write a program to check odd or even.

import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to check  odd or even");
	int num = sc.nextInt();
	// by using if-else statement we will check 
	if(num%2==0){
		System.out.println("This number is even");
	}else{
		System.out.println("This number is odd ");
	    }		
	}
}