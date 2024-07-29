import java.util.Scanner;
public class SwapOfTwoNumbers
{
	public static void main(String [] args)
	{
		Scanner inpObj=new Scanner(System.in);
		int a =inpObj.nextInt();
		int b =inpObj.nextInt();
		
		int c;
		System.out.println("Before Swap: a="+ a +"b="+ b);
		//int n=inpObj.nextInt();
		  c=a;
		  a=b;
		  b=c;
		 System.out.println("After Swap: a="+a +"b="+ b);
	}
}