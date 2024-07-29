import java.util.Scanner;
public class Hospital{
	public void money(){
		System.out.println("Welcome to the Hospital");
	}
	public static void main(String[] args){
		Hospital h = new Hospital();
		h.money();
		Scanner bill = new Scanner(System.in);
		System.out.println("How much you paid??");
		int paid = bill.nextInt();
		System.out.println("What medicine you have taken??");
		String medicine = bill.next();
		System.out.println("OK... Thank you Visit again");
	}
}