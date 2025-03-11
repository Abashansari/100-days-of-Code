class Shape {
	String color;
}
class Trangle extends Shape {


	public void printInfo() {
		System.out.println(this.color);
	}
}
public class Main {
	public static void main(String[] args) {
		Trangle t1 = new Trangle();
		t1.color = "red";
		t1.printInfo();
	}
}