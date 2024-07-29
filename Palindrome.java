import java.util.Scanner;
   public class Palindrome
   {
	   public static void main(String[] reddy)
	   {
		   Scanner inpObj=new Scanner(System.in);
		   System.out.print("Enter The Given Number ?");
		   int n=inpObj.nextInt();
		   int r,q,sum=0;
		   int i=12321;
		   while(n>0)
		   {
		   r=n%10;          //r=12321%10=1
		   q=n/10;           //q=12321/10=1232
		   sum=sum*10 + r;    //sum=sum*0+r=1 (The loop will run 5 times until remainder becomes 0) 
		   n=q;                //loop will be run until n=1
		   }
		   if(sum==i)
				System.out.println("It is a Palindrome Number");
           else
				System.out.println("It is not a Palindrome Number");
	   }
   }	   