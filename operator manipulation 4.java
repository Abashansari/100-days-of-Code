public class Main {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int result = a & b;
		System.out.println(result);
	}
}

/*    Logic behind this

a = 5 = 0101 (In Binary)
b = 7 = 0111 (In Binary)

Bitwise AND Operation of 5 and 7
  0101
& 0111
 ________
  0101  = 5 (In decimal)
  */