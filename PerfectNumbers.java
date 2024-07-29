import java.util.Scanner; 
 public class PerfectNumbers 
 {
    public static void main(String[] args) 
	{
        
        Scanner inpObj=new Scanner(System.in);
		System.out.print("Enter an  integer number : ");
		int n=inpObj.nextInt();
        System.out.println("First " + n + " perfect numbers are :");
          int num=1;
		  int count=0;
        while (count < n)
		{			
		int fsum=0;
			for(int i=1; i<num; i++)
			{
				if(num%i==0)
					fsum += i;
			}
			if(fsum==num)
			{
				System.out.println(num);
			count++;
			}
		num++;
		}
    }
}

