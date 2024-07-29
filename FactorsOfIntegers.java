import java.util.Scanner;
public class FactorsOfIntegers
{
	public static void main (String[] args)
	{
		Scanner inpObj=new Scanner(System.in);
		System.out.print("Enter an Integer ?");
		int n=inpObj.nextInt();
		System.out.print("Factors:");
		for(int d=1;d<=n;d++)
			if(n%d==0)
				System.out.println(d+"");
	}
}