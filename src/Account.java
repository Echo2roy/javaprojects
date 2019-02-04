
public class Account {
    private String name; // Instance variable


    //constructor initialises name with parameter name //Automatic setter
    public Account(String name)
    {
        this.name = name;
    }
    //method to set the name of the object
    public void setName(String name)
    {
        this.name = name; //store the name
    }

    public String getName()
    {
        return name; // return value of the name to caller
    }

}
