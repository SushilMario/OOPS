package StudentPackage;

public class CreditLimit extends Exception
{
    String message;

    public CreditLimit(String message)
    {
        this.message = message;
    }

    public String toString()
    {
        return "Error! " + message;
    }
}
