import java.util.*;
public class Main {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);                System.out.println("Enter a number to get table:");
	  int num = sc.nextInt();
	  for(int i = 10 ; i >= 0 ;  i--){
	      int table = i * num;	  
	  System.out.println(num+"×"+i+"="+table);
	   } 
    }
}