package Faculty;

public class AgeException extends Exception
{
    String message;

    public AgeException(String message)
    {
        this.message = message;
    }

    public String toString()
    {
        return "Error ! " + message;
    }
}
