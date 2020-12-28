import java.util.Scanner;

public class Personal 
{
    String name, education;
    int age, noOfYears, noOfLoans;
    double basic, da, hra, loanAmount;

    Personal()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        name = sc.nextLine();

        System.out.println("Enter the name of your college of higher education");
        education = sc.nextLine();

        System.out.println("Enter your age");
        age = sc.nextInt();

        System.out.println("Enter the number of years of experience you have");
        noOfYears = sc.nextInt();

        System.out.println("Enter the number of outstanding loans you have");
        noOfLoans = sc.nextInt();

        System.out.println("Enter your basic salary");
        basic = sc.nextDouble();

        System.out.println("Enter your dearness allowance");
        da = sc.nextDouble();

        System.out.println("Enter your house rent allowance");
        hra = sc.nextDouble();

        System.out.println("Enter your total outstanding loan amount");
        loanAmount = sc.nextDouble();
    }

    void isEligible()
    {
        if(noOfLoans == 0)
        {
            System.out.println("You are eligible for a loan!");
        }

        else
        {
            System.out.println("You are not eligible for a loan");
        }
    }

    void taxPay()
    {
        double taxAmount;

        taxAmount = (basic + da + hra) * (10.0 / 100);

        System.out.println("You are to pay Rs " + taxAmount + " in tax");
    }

    void isEligiblePromotion()
    {
        if(noOfYears >= 10)
        {
            System.out.println("You are eligible for a promotion!");
        }

        else
        {
            System.out.println("You are not yet eligible for a promotion");
        }
    }

    void display()
    {
        System.out.println("Name: " + name);

        System.out.println("Higher Education: " + education);

        System.out.println("Age: " + age);

        System.out.println("Experience: " + noOfYears + " years");

        System.out.println("Number of loans: " + noOfLoans);

        System.out.println("Basic salary: Rs " + basic);

        System.out.println("Dearness allowance: Rs " + da);

        System.out.println("House Rent Allowance: Rs " + hra);

        System.out.println("Loan amount: Rs " + loanAmount);
    }

    public static void main(String args[])
    {
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of accounts to be created");
        n = sc.nextInt();

        Personal accounts[] = new Personal[n];

        for(int i = 0; i < n; i++)
        {
            System.out.println("Account " + (i + 1));

            accounts[i] = new Personal();

            accounts[i].isEligible();
            accounts[i].taxPay();
        }

        sc.close();
    }
}
