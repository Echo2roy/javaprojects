import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AccountTextFile {
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

   
}
