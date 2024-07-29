import java.util.Scanner;
   public class SumOfTwoPerfectNumbers
   {
	   public static void main(String[] a)
	   {
		   Scanner inpObj=new Scanner(System.in);
		   System.out.print("Enter the first perfectnumber and second perfectnumber : ");
		   int n1=inpObj.nextInt();
		   int n2=inpObj.nextInt();
		
		    int PN1 = n1, PN2 = n2, PN;
                 PN = PN1 + PN2;

            System.out.println("Sum of two perfect numbers is: " + PN);
        
                int fsum = 0;
                    for (int i = 1; i < PN; i++)
						{
                       if (PN % i== 0) 
					   {
                        fsum = +i;
                       }
                     }
          
            if (fsum == PN) 
                System.out.println("it is a perfect Number");
	    	else
				System.out.println("it is not a perfect Number");
	   }
   }
   
	   
		   