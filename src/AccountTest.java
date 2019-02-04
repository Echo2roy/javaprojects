import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args)
    {   // scanner object
        Scanner input  = new Scanner(System.in);

        // Account object
        Account account1 = new Account("Echo B");

        //display name
        System.out.printf("Initial name is: %s%n", account1.getName());
    }
}
