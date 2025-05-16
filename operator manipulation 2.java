public class OperatorLogicExample {
	public static boolean isEven(int num) {
		return (num & 1) == 0;
	}
	public static void main(String[]args) {
		int number = 43;
		System.out.println(number + " is Even number ? " + isEven(number));
	}
}
