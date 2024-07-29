public class PrimeNumber
{
  public static void main(String[] a)
  {
	  System.out.print("Prime Numbers :");
      int i=2;
         while(true)
		 {
           int fcount=0;
           int num=1;
		   while(num<=i)
		   {
			   if(i%num==0) 
			   {
				   fcount++;
			   }
			  num++;
		   }
		   if(fcount==2)
		   {
			   System.out.println(i+ " ");
		   }
		    i++;
		 }
  }
  
}
		   