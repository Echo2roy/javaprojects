import java.util.Scanner;
import javax.swing.JOptionPane;

public class AccountTest {
    public static void main(String[] args)
    {   // scanner object
        Scanner input  = new Scanner(System.in);

        // Account object
        Account account1 = new Account("Echo B", 50000);

        System.out.println("Welcome to Echo-b Bank");
        System.out.println("Enter \n 1 to check balance\n 2 to Deposit\n 3 to withdraw");
        int choice = input.nextInt();

        switch (choice)
        {
            case 1:
                System.out.printf("Your balance is: $%.2f", account1.getBalance());
                break;
            case 2:
                System.out.println("Enter Amount: ");
                double depositAmount = input.nextDouble();
                account1.deposit(depositAmount);
                System.out.printf("New balance: $%.2f", account1.getBalance());
                break;
            case 3:
                System.out.println("Enter Amount: ");
                double withdrawal = input.nextDouble();
                account1.withdraw(withdrawal);
                System.out.printf("New balance: $%.2f", account1.getBalance());
                break;
        }

        //display name
       // System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());

    }
}
