import java.util.Scanner;
import javax.swing.JOptionPane;

public class AccountTest {
    public static void main(String[] args)
    {   // scanner object
//        Scanner input  = new Scanner(System.in);

        // Account object
        Account account1 = new Account("Echo B", 50000);

        //display name
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());

        // Prompt for a deposit
   //     System.out.println("Enter deposit: ");
     //   double depositAmount = input.nextDouble();
       // account1.deposit(depositAmount);

   //     System.out.printf("New account balance is: $%.2f", account1.getBalance());

    }
}
