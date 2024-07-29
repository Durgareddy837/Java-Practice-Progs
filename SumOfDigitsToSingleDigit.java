import java.util.Scanner;
public class SumOfDigitsToSingleDigit
{
	public static void main(String[] a)
	{
		Scanner inpObj=new Scanner(System.in);
		System.out.print("Enter an Integer:");
		int n=inpObj.nextInt();
		int r=n;
		while(r>9)
		{
			int sum=0;
			while(r>0)
			{
				sum +=r%10;
				r/=10;
			}
			r=sum;
		}
		System.out.println("The sum of digits to a Single digit is : " + r);
	}
}
