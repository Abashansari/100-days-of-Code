//Q. pattern of Inverted Half Pyramid with Number.
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number for inverted half pyramid with number : ");
		int n = sc.nextInt();
		for(int i = 1 ; i <= n; n--){
		    for(int j = 1; j < n; j++){
		        System.out.print(j+" ");
		    }
		    System.out.println(n);
		}
		
	}
}