import java.util.Scanner;
public class PerfectNumber
{
	public static void main(String[] args)
	{
		Scanner inpObj=new Scanner(System.in);
		System.out.print("Enter an Integer to Test ?");
		int n =inpObj.nextInt();
		 int fsum=0;
		 for(int i=1;i<n-1;i++)
			 if(n%i==0)
				 fsum+=i;
			 if(fsum==n)
				 System.out.println("It Is a Perfect Number");
			 else
				 System.out.println("It Is not a Perfect Number");
	}
}
			 
				 
		