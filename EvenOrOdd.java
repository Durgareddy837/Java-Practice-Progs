import java.util.Scanner;
class EvenOrOdd{
public static void main(String[]reddy){
System.out.print("enter an integer ?");
Scanner inpObj=new Scanner(System.in);
int n=inpObj.nextInt();
int r=n%2;
if(r==0)
   System.out.println("Even");
if(r==1)
   System.out.println("Odd");
}
}   