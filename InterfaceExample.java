interface I1{
	int a = 12;
	public void show();
	public static void disp(){
		System.out.println("I1 display method");
	}
}
interface I2 extends I1{
	public default void disp(){
		System.out.println("I2 display method");
	}
}
class Test implements I1,I2{
	public void show(){
		System.out.println("test method");
	}
}
public class InterfaceExample {
	public static void main(String[] args) {
		Test t = new Test();
		t.show();
		t.disp();
		System.out.println(t.a);
	}
}