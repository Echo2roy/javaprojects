import java.util.Scanner;
import javax.swing.JOptionPane;

public class AccountTest {
    public static void main(String[] args)
    {   // scanner object
        Scanner input  = new Scanner(System.in);

        // Account object
        Account account1 = new Account("man", 50000);

  //     System.out.println("Welcome to Echo-b Bank");
        JOptionPane.showMessageDialog(null, "Welcome to Echo");
        String name = JOptionPane.showInputDialog("what is your name?");

        if (name != account1.getName()) {


           // System.out.println("Enter \n 1 to check balance\n 2 to Deposit\n 3 to withdraw");
            String reply = JOptionPane.showInputDialog("Enter \n 1 to check balance\n 2 to Deposit\n 3 to withdraw");
            int choice = Integer.parseInt(reply);
           // int choice = input.nextInt();

            switch (choice) {
                case 1:
                    double balance = account1.getBalance();
                    String s = Double.toString(balance);
                    String word = String.format("Your balance is %s",s);

                    JOptionPane.showMessageDialog(null, word);

               //   JOptionPane.showMessageDialog(null,s);
              //    System.out.printf("Your balance is: $%.2f", account1.getBalance());
                    break;
                case 2:
                    //System.out.println("Enter Amount: ");
                    String read = JOptionPane.showInputDialog("Enter amount: ");

                    //double depositAmount = input.nextDouble();
                    double depositAmount = Integer.parseInt(read);
                    account1.deposit(depositAmount);

                    //System.out.printf("New balance: $%.2f", account1.getBalance());
                    // Casting balance to string to output through GUI
                    String s1 = Double.toString(account1.getBalance());

                    // Assign output message with new balance in "message"
                    String message = String.format("Your new balance is %s", s1);

                    // Paste new balance on the screen
                    JOptionPane.showMessageDialog(null, message);

                    break;
                case 3:
                    //System.out.println("Enter Amount: ");
                    String wAmount = JOptionPane.showInputDialog("Enter amount: ");

                   // double withdrawal = input.nextDouble();
                    double withdrawal = Integer.parseInt(wAmount);
                    // Withdrawal takes place
                    account1.withdraw(withdrawal);
                    // Casting balance to string to output through GUI
                    String s2 = Double.toString(account1.getBalance());

                    // Assign output message with new balance in "message"
                    String text = String.format("Your new balance is %s", s2);

                    // Paste new balance on the screen
                    JOptionPane.showMessageDialog(null, text);

                   // System.out.printf("New balance: $%.2f", account1.getBalance());
                    break;
            }
        }

        else {
            System.out.println("You don't have an account");
        }


        //display name
       // System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());

    }
}
