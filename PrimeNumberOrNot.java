import java.util.Scanner;
public class PrimeNumberOrNot
{
	public static void main(String [] args)
	{
		Scanner inpObj=new Scanner(System.in);
		System.out.print("Give a number to test whether it is prime or not ?");
		int n=inpObj.nextInt();
		int fcount=0;
		for(int d=1;d<=5;d++)
			if(n%d==0)
				fcount++;
			if(fcount==2)
				System.out.println("It is a Prime Number");
			else 
				System.out.println("It is a not a Prime Number");
	}
}