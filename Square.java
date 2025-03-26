import java.util.Scanner;
class Square{
	int num;
	public void square(){
	  int  result = num*num;
	    System.out.println("The square of "+num+" is : "+ result);
	}
}
	public class Main{	    
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Square s1 = new Square();
	System.out.print("Enter a number to find square of it :");
	 s1.num = sc.nextInt();
	s1.square();
		
	}
}