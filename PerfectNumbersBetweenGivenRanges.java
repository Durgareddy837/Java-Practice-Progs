import java.util.Scanner;

public class PerfectNumbersBetweenGivenRanges 
{
    public static void main(String[] args) 
	{
        Scanner inpObj = new Scanner(System.in);
        
        System.out.print("Enter the first integer number and second integer :");
        int n1 = inpObj.nextInt();
        int n2 = inpObj.nextInt();
        
        System.out.print("Perfect numbers between the given integers are: ");
        
        for (int i = n1; i <= n2; i++)
			{
            int fsum = 0;
            
            for (int d = 1; d < i; d++) 
			{
                if (i % d == 0)
			    {
                    fsum += d;
                }
            }
            
            if (fsum == i) 
			{
                System.out.println(i);
            }
        }
    }
}
