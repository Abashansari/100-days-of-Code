//Q.Find the factorial of a given number

import java.util.*;
public class main{
    // user-defined method
    public static void factorial(int num){
        if(num < 0){
            System.out.println("Invalid number !");
            return  ;
        }
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact = i*fact;
       } 
        System.out.println("The factorial of "+num+" is : "+fact);
        return;
    }     
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        //Calling method 
          factorial(num);
            }
       }