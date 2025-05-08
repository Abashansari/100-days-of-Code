public class Main {
	public static void main(String[] args) {
		int sum = 0;
		int [][] intArr = new int [5][8] ;
		for (int i = 1; i <= intArr.length; i++) {
			for (int j = 1; j <= intArr.length; j++) {
				int mul = i * j;
				System.out.print(mul + " ");
				sum = sum + mul ;
			}
			System.out.println(":" + sum);
			sum = 0;
		}
	}
}