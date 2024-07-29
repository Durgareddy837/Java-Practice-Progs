import java.util.Scanner;
public class PrimeNumberUptoN {
    public static void main(String[] args) {
        Scanner inpObj = new Scanner(System.in);
        System.out.print("Enter an integer number : ");
        int n1 = inpObj.nextInt();
		System.out.println("Prime Numbers from 2 to" + " N " + "are:"); 
         for (int i = 1; i <= n1; i++)
		 {
            int fcount = 0;
            for (int d = 1; d<= i; d++) 
			{
                if (i%d == 0) 
				fcount++;
            }	
            if (fcount == 2) 
			{
                System.out.println(i);
            }
        }
    }
}

        			