public class AccountTextFileTest {
    public static void main(String[] args)
    {
        AccountTextFile application = new AccountTextFile();

        application.openFile();
        application.addRecords();
        application.closeFile();
    }
}
