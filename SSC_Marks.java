import java.util.Scanner;
class SSC_Marks{
public static void main(String[]Reddy){
Scanner inpObj=new Scanner(System.in);
  System.out.print("Enter Your Marks in Telugu,Hindi,English,Maths,Science ?");
   int T = inpObj.nextInt();
   int H = inpObj.nextInt();
   int E = inpObj.nextInt();
   int M = inpObj.nextInt();
   int S = inpObj.nextInt();
   if (T>=35)
	   if(H>=35)
		   if(E>=35)
			   if(M>=35)
				   if(S>=35)
					  
		   System.out.println("pass");
	    else System.out.println(" Science fail"); 
	  else System.out.println(" Maths fail"); 
	 else System.out.println(" English fail"); 
	else System.out.println("Hindi fail"); 
   else System.out.println("Telugu fail"); 
}
}
	   
		   
   
  
  