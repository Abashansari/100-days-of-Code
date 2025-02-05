//Q.Make a function to multiply 2 number and return the product

import java.util.*;
public class main{
    //user-defined function
   public static int multiplication(int a,int b){
        int mul = a*b;
        return mul;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter first number :");
        int a = sc.nextInt();
        System.out.print("Enter second number :");
        int b = sc.nextInt();
        int mul = multiplication(a,b);
        System.out.println("The multiplication of "+a+"×"+b+" is :"+mul);    
              }
       }