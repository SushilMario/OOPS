package ResultPackage;

public class InvalidSGPA extends Exception
{
    String message;

    public InvalidSGPA(String message)
    {
        this.message = message;
    }

    public String toString()
    {
        return "Error! " + message;
    }
}