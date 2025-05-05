import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		double [] arr = {2.1, 3.2, 4.3, 5.4, 6.5};
		for (int i = 0; i < arr.length; i++) {
			arr[i] /= 2;
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println("Values :" + arr[i]);
		}
	}
}