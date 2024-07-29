//import java.util.Scanner;
public class PalindromeNumber
{
	public static void main(String [] a)
	{
		/*Scanner inpObj=new Scanner(System.in);
		System.out.print("Enter the  Palindrome numbers are :");
		int n1=inpObj.nextInt();
		int n2=inpObj.nextInt();
		 
		System.out.println("Palindrome Numbers between" +n1+ "and" +n2+ "are :");*/
		
		int n1 =121, n2=212;
        for(int i=n1; i<=n2; i++)
		{
			int n=i,ON=n,r=0;
			while(n>0)
			{
				int digit=n%10;
				    r=r*10+digit;
				    n=n/10;
			}
			if(ON==r)
				System.out.println(ON+" ");
		}
		        System.out.println();
	}
}

          			