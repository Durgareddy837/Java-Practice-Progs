import java.util.Scanner;
public class FibonaacciSeries
{
	public static void main(String[] reddy)
	{
		
		int a=0,b=1,c;
		Scanner inpObj=new Scanner(System.in);
	    System.out.print("Enter the integers :");
		int n=inpObj.nextInt();
		for(int i=0;i<=5;i++){
			c=a+b;
			a=b;
			b=c;
		}
		
		
	}
}