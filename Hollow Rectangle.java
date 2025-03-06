//Q. print Hollow Rectangle.
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("The pattern of Hollow Rectangle.");
	System.out.println("Enter the number for rows : ");
	int row = sc.nextInt();
	System.out.println("Enter the number for coloum : ");
	int coloum = sc.nextInt();
	
	for(int i= 1; i <= row; i++){
		for(int j = 1; j <= coloum; j++){
		   if(i == 1 || j == 1 || i == row || j == coloum){
		System.out.print("*");
		   }else{
		       System.out.print(" ");
		   }
		}
		System.out.println(" ");
	}
	}
}