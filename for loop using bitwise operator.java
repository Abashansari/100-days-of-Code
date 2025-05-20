public class Main {
	public static void main(String[] args) {
		int i = 1;
		for (; i <= 5;) {
			System.out.println(i);
			i = -~i;
		}
	}
}