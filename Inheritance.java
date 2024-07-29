abstract class Parent {
	int a = 3;
	abstract void show();
}
abstract class Child extends Parent{
	int b = 5;
	abstract void view();
}
class GrandChild extends Child{
	void show(){
		System.out.println("parent class method");
	}
	void view(){
		System.out.println("child class method");
	}
	void disp(){
		System.out.println("GrandChild class method");
	}
}
public class Inheritance{
	public static void main(String [] a){
		GrandChild gc = new GrandChild();
		gc.show();
		gc.view();
		gc.disp();
		System.out.println("Field of parent class :" + gc.a);
		System.out.println("Field of child class :" + gc.b);
	}
}