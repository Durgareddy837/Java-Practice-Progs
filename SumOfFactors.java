import java.util.Scanner;
public class SumOfFactors
{
	public static void main(String[] args)
	{
		Scanner inpObj=new Scanner(System.in);
		System.out.print("Enter an integer ?");
		int n=inpObj.nextInt();
		System.out.print("Factors:");
		int f=0;
		for(int d=1;d<=n;d++)
			if(n%d==0)
				f=f+d;
			System.out.println("sum="+f);
	}
}