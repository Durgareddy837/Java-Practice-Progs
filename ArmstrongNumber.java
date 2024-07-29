import java.util.Scanner;
    public class ArmstrongNumber
    {
		public static void main(String[] reddy)
		{
			Scanner inpObj=new Scanner(System.in);
			System.out.print("Enter a 3 digit number bitween (100-999)");
			int n=inpObj.nextInt();  //n=153
			int r,q,sum=0;
			int i=153;
			while(n>0)       //1>0 or we can take (do { later while(n!=0) )
			{
			r=n%10;          //r=153%10=3
			q=n/10;          //q=153/10=15
			sum=sum+r*r*r;  //sum=0+3*3*3;sum=9
			n=q;            //loop will be run until n=1
			}
		if(sum==i)
			System.out.println("Given Number is an Armstrong Number");
		else
			System.out.println("Given Number is not a Armstrong Number");
		}
	}
	