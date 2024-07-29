import java.util.Scanner;          //import Scanner from (java.util)
public class PerfectNumberUptoN    //class of the program
{
	public static void main(String[] args)   // main of the program
	{
		Scanner inpObj=new Scanner (System.in);   //New instance of Scanner class is created and it creates inpObj to read from the user
		System.out.print("integers upto N : ");   //Asking the user to give the value
		int n=inpObj.nextInt();        
		
		   for (int i=6; i<= n; i++) //integer variable starts from 6 to n and loop will continue until user given the number
		   {
            int fsum = 0;            //
			for (int d=1;d<i;d++)
			{				
                if (i%d == 0)
				{					   
                    fsum += d;
			}
			}
		        if (fsum == i)
					{
                System.out.println(i + " is a perfect number.");
			        }
        }
    }	
}		   
       
		