import java.util.Scanner;
public class ReverseTheNumber
{
	public static void main(String[] reddy)
	{
		Scanner inpObj=new Scanner(System.in);
		System.out.print("Enter an Integer :");
		int n=inpObj.nextInt();
		int r,q,rev=0;
		while(n>0)
		{
		r=n%10;                 // r=134%10=4
		q=n/10;                //q=134/10=13
		rev=rev*10 + r;        //rev=0*10 + 4= 4
		n=q;                    //loop will be run until n=1
		}
			System.out.println("Reverse Number is:"+rev);
	}
}
		