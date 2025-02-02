//Q. write a program to print Greeting.

import java.util.*;
public class main{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
   System.out.println("Select a number : 1,2,3");
     int a = sc.nextInt();
     
     if(a==1){
         System.out.println("Hello");
     }else if(a==2){
         System.out.println("Assalamualikum");
     }else if(a==3){
         System.out.println("Namaste");
              }else{
                  System.out.println("Invalid input.");
              }
          }
       }