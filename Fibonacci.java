import java.util.Scanner;

class Fibonacci
{
    void no_recursion(int count)
    {
        int a = 0, b = 1, fib;

        System.out.println(a);

        if(count >= 2)
        {
            System.out.println(b);

            for(int i = 1; i <= count - 2; i++)
            {
                fib = a + b;

                System.out.println(fib);

                a = b;

                b = fib;
            }
        }
    }

    int recurse(int count) 
    {
        if(count == 0)
        {
            return 0;
        }

        else if(count == 1)
        {
            return 1;
        }

        else
        {
            return recurse(count - 1) + recurse(count - 2);
        }
    }
    public static void main(String args[])
    {
        Fibonacci series = new Fibonacci();

        int count;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the count");
        count = sc.nextInt();

        System.out.println("Recursive");

        for(int i = 0; i < count; i++)
        {
            System.out.println(series.recurse(i));
        }

        System.out.println("Non-recursive");

        series.no_recursion(count);

        sc.close();
    }
}