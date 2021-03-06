import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AccountTextFile extends Account{
    private Formatter output; // object used to output text to file

    //enable user to open file
    public void openFile()
    {
        try
        {
            output = new Formatter("client.txt"); //opens file
        }
        catch(SecurityException securityexception)
        {
            System.err.println("You do not have write access to this file");
            System.exit(1); //terminates program
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            System.err.println("Error opening or creating file");
            System.exit(1);//terminates the program
        }
    }

    public void addRecords()
    {
        //object to be written to file

        Scanner input = new Scanner(System.in);

        //prompt user to input in order
        System.out.printf("%s\n%s\n%s\n%s\n\n",
                "To terminate input, type the end-of-file indicator",
                "when you are prompted to enter input.",
                "On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
                "On Windows type <ctrl> z then press Enter" );
       // System.out.printf("%s\n%s",
           //     "Enter account balance and name",
         //       "?");

       // while(input.hasNext())// loop until end-of-file indicator
        {
            try              //output values to file
            {
                System.out.print("Enter Pin: ");
                setPin(input.next());
                System.out.print("Enter Balance: ");
                setBalance(input.nextDouble());
                System.out.print("Enter Name: ");
                setName(input.next());
              //  record.setPin(input.nextLine());

                //Writing on file
                if(getBalance()>0){
                    //write new record
                    output.format("%s,%.2f, %s\n",getPin(), getBalance(),
                            getName());
                }// end if
                else{
                    System.out.println("Account Balance ,ust be greater than 0");
                }//end else
            } //end try
            catch (FormatterClosedException formatterClosedException)
            {
                System.err.println("Error writing to file. ");
                return;
            } //end catch
            catch (NoSuchElementException elementException)
            {
                System.err.println("Invalid input. Please try again");
                input.nextLine(); // discard input so user can try again
            } //end catch

           // System.out.printf("%s\n","?");
        } //end while
    } //end method add Records

    //close file
    public void closeFile()
    {
        if(output != null)
            output.close();
    }
}
