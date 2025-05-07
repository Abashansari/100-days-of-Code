public class Main {
	public static void main(String[] args) {
		int [][] intArr = new int [5][8] ;
		for (int i = 1; i <= intArr.length; i++) {
			for (int j = 1; j <= intArr.length; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}