public class Main {
	public static void main(String[] args) {
		System.out.println("Before swapping :");
		int a = 11;
		int b = 22;
		System.out.println("a = " + a + "\n" + "b = " + b);
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
		System.out.println("After swapping :");
		System.out.println("a = " + a + "\n" + "b = " + b);
	}
}