
public class Account {
    private String name; // Instance variable
    private double balance;


    //constructor initialises name with parameter name //Automatic setter
    public Account(String name, double balance)
    {
        this.name = name;
        if (balance > 0.0)
            this.balance = balance;
    }

    //method to set the name of the object
    public void deposit(double depositAmount){
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
    }

    //method to collect money from account
    public void withdraw(double withdrawal){
        if(withdrawal >= balance)
            System.out.println("You don't have enough funds");
        else
            balance = balance - withdrawal;
    }

    public double getBalance(){
        return balance;
    }

    public void setName(String name)
    {
        this.name = name; //store the name
    }

    public String getName()
    {
        return name; // return value of the name to caller
    }

}
