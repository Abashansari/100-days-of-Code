//---------------------------MyClass.java (file)-------------->
package displayName;
public class MyClass {
	public void display() {
		System.out.print("My name is Abash Ansari");
	}
}
//-------------------importing the package---------------->

//---------------------------Main.java (file)-------------------->
package displayName;

import displayName.MyClass;

public class Main {
	public static void main(String[] args) {
		MyClass m1 = new MyClass();
		m1.display();
	}
}


