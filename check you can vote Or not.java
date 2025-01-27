//Q. write a program to check you can vote or not .

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you age :");
		int age = sc.nextInt();
		if(age>=18){
		    System.out.println("You can vote.");
		}else{
		    System.out.println("Sorry ! you can't vote");
		}
	}
}