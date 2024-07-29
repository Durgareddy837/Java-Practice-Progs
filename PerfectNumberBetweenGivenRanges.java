import java.util.Scanner;

public class PerfectNumbersBetweenGivenRanges {
    public static void main(String[] args) {
        Scanner inpObj = new Scanner(System.in);
        
        System.out.print("Enter the first integer number: ");
        int n1 = inpObj.nextInt();
        int n2 = inpObj.nextInt();
        
        System.out.print("Perfect numbers between the given ranges: ");
        
        for (int num = n1; num <= n2; num++) {
            int fsum = 0;
            
            for (int d = 1; d < num; d++) {
                if (num % d == 0) {
                    fsum += d;
                }
            }
            
            if (fsum == num) {
                System.out.println(num);
            }
        }
    }
}
