import java.util.Scanner;

public class ArmstrongNumberUptoN {
    public static void main(String[] args) {
        Scanner inpObj = new Scanner(System.in);
        System.out.print("Enter an Integer Upto N: ");
        int n = inpObj.nextInt();

        for (int num = 1; num <= n; num++) {
            int sumOfCubes = 0;
            int originalNum=num;
			int digit;
			int temp=digit;
			
            while (temp > 0) {
                digit = temp % 10;
                sumOfCubes += digit * digit * digit;
                temp /= 10;
            }

            if (sumOfCubes == num) {
                System.out.println("Armstrong number: " + num);
            }
        }
        
        inpObj.close(); // Close the Scanner object when done
    }
}