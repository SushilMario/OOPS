package StudentPackage;

import java.util.Scanner;

public class RegisterStudent implements Student
{
    public String name, branch;
    public int credits[];
    public int marks[][];

    public void get()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");

        name = sc.next();

        System.out.println("Enter your branch");

        branch = sc.next();
    }
}