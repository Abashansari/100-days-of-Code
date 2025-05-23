public class Main {
	public static void main(String[] args) {
		boolean a = (false && false);
		boolean b = (true && true);
		boolean c = (false || false);
		boolean d = (true || true);
		System.out.println("false AND false:  " + a);
		System.out.println("true AND true: " + b);
		System.out.println("false OR false:  " + c);
		System.out.println("true OR true:  " + d);
	}
}