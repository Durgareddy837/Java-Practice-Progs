import java.util.Scanner;
   public class SumOfDigits
   {
	   public static void main(String[] a)
	   {
		   Scanner inpObj=new Scanner(System.in);
		   System.out.print("Enter an Integer ?");
		   int n = inpObj.nextInt();   //n=152
		   int r,q,sum=0;
		   do
		   {
		   r=n%10;      //152%10 to get remainder = 2
		   q=n/10;      //152/10 to get quotient =15
		   sum=sum+r;  // 0+2=2 & loop will be repeat 3 times because given number has 3 digits
		   n=q;		   //loop will be run until n=1
		   }
		   while(n!=0);
		   System.out.println("Sum of given Digits ="+sum);
	   }
   }
		   