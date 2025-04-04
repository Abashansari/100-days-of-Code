//Returns the value of base raised to the power of exponent.  
import java.util.Scanner;
//import java.math.*;
class PowerCalculator{
    float base;
    float exponent;
    public void baseExponent(){
          double result = Math.pow(base,exponent);
        System.out.println("The value of base raised to the power of exponent is : "+ result);
    }
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    PowerCalculator p1 = new PowerCalculator();
		System.out.print("Enter the base :");
		p1.base = sc.nextFloat();
		System.out.print("Enter the exponent :");
		p1.exponent = sc.nextFloat();
		p1.baseExponent();
		
	}
}