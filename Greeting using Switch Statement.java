//Q. write a program to print Greeting by using Switch Statement.

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
System.out.println("Select a number :1,2,3");
   int a = sc.nextInt();
   switch(a){
       case 1:
                  System.out.println("Namaste");
                  break;
       case 2:
                   System.out.println("Hello");
                   break;
       case 3:  
            System.out.println("Assalamualikum");
            break;
            default:
            System.out.println("Invalid Input");     
       }
	}
}