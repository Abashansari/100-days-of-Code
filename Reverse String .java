public class ReverseString {
	public static void main(String[] args) {
		String name = "Abash Ansari !";
		StringBuilder rs = new StringBuilder(name);
		rs.reverse();
		System.out.println("Original string: " + name);
		System.out.println("Reversed string: " + rs.toString());
	}
}