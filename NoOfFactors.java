import java.util.Scanner;
public class NoOfFactors
{
	public static void main(String[] args)
	{
	    Scanner inpObj=new Scanner(System.in);
		System.out.print("Enter an integer?");
		int n=inpObj.nextInt();
		int fcount=0;
		for(int d=1;d<=n;d++)
			if(n%d==0)
				fcount++;
			System.out.println("No Of Factors="+fcount);
	}
}
		