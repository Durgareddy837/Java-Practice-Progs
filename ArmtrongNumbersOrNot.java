import java.util.Scanner;
public class ArmstrongNumbersOrNot
{
	public static void main(String[] a)
	{
		Scanner inpObj=new Scanner(System.in);
		System.out.print("Enter an Integer :");
		int n1=inpObj.nextInt();
		
		int n=n1,b=0,sum=0;
		
		while(n!=0)
		{
			n=n/10;
			b++;
		}
		n=n1;
		while(n!=0)
		{
			int digit=n%10;
			sum+= Math.pow(digit,numberofdigits);
			n=n/10;
		}
		
		if(sum==n1)
			System.out.println("It is a Armstrong Number");
		else
			System.out.println("It is not a Armstrong Number");
	}
}

			
			