import java.util.Scanner;

class Prime
{
    static void check(int num)
    {
        int count = 0;

        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                count++;
            }
        }

        if(count == 2)
        {
            System.out.println("The number is prime");
        }

        else
        {
            System.out.println("The number isn't prime");
        }
    }

    public static void main(String args[])
    {
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        num = sc.nextInt();

        Prime.check(num);

        sc.close();
    }
}