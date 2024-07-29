import java.util.Scanner;
class AgeOfPerson
{
	public static void main(String[] args)
	{
		System.out.print("enter your age(in years)");
		Scanner scObj= new Scanner(System.in);
		int age =scObj.nextInt();
		System.out.println("age="+age);
	}
}
