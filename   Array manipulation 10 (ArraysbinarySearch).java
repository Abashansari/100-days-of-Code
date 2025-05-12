import java.util.Arrays;
public class main {
	public static void main(String[]args) {
		int []arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};

		System.out.print("The index of no.44 in arr is :" + Arrays.binarySearch(arr, 44));
	}
}