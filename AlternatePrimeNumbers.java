import java.util.Scanner;
public class AlternatePrimeNumbers
{
	public static void main(String [] reddy)
	{
		Scanner inpObj=new Scanner(System.in);
		System.out.print(" Enter an Integer : ");
        int n =inpObj.nextInt();
         
       int count=0;
       int num=2;
		while(count<n)
			for(int i=0; i<=n; i++)
			{
			if(count%2==0)
			System.out.println("num=" + num);	
			count++;
			}
			num++;
	}
}
		
	