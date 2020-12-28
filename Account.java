import java.util.Scanner;

class Account
{
    int AccNo;

    long Phone_No;

    float balance_amt;

    String name;

    void getInput()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the account number");

        AccNo = sc.nextInt();

        System.out.println("Enter the phone number");

        Phone_No = sc.nextLong();

        System.out.println("Enter the account balance");

        balance_amt = sc.nextFloat();

        System.out.println("Enter your name");

        name = sc.next();
    }

    void deposit(float amount)
    {
        balance_amt += amount;

        System.out.println("New Balance: " + balance_amt);
    }

    void withdraw(float amount)
    {
        balance_amt -= amount;

        System.out.println("New Balance: " + balance_amt);
    }

    void display()
    {
        System.out.println("Balance: " + balance_amt);
        System.out.println("Name: " + name);
        System.out.println("Account No: " + AccNo);
        System.out.println("Phone No: " + Phone_No);
    }

    public static void main(String args[])
    {
        Account account = new Account();
        Scanner sc = new Scanner(System.in);

        account.getInput();

        float deposit_amt, withdraw_amt;

        System.out.println("Enter a deposit amount");
        deposit_amt = sc.nextFloat();

        account.deposit(deposit_amt);

        System.out.println("Enter a withdrawal amount");
        withdraw_amt = sc.nextFloat();

        
        account.withdraw(withdraw_amt);
        
        account.display();

        sc.close();
    }
}