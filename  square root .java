import java.util.Scanner;
class Square{
    double number;
    public void squareRoot(){
       double result = Math.sqrt(number);  
        System.out.println("The square root of "+number +" is : "+result); 
    }
}
public class Main {
	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    Square s1 = new Square();
		    System.out.print("Enter a number to get square root :");
		     s1.number = sc.nextInt();
		     s1.squareRoot();
     
   
	}
}