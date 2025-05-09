public class Main {
	public static void main(String[] args) {
		int [] intArr = new int[5];
		for (int i = 0; i <= intArr.length - 1; i ++) {
			intArr[i] = i * 2;
		}
		for (int i = 0; i <= intArr.length - 1; i++) {
			System.out.print(intArr[i] + ",");
		}
	}
}