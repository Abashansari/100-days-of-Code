public class Main {
	public static void main(String[] args) {
		int[][] a = {{1, 2}, {3, 4}};

		int[][] cloneA = new int[a.length][];
		for (int i = 0; i < a.length; i++) {
			cloneA[i] = a[i].clone();
		}
		for (int i = 0; i < cloneA.length; i++) {
			System.out.println(java.util.Arrays.toString(cloneA[i]));

		}
	}
}
