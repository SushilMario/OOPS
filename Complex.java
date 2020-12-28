import java.util.Scanner;

class Complex
{
    int a1, b1, a2, b2;

    Complex(int a1, int b1, int a2, int b2)
    {
        this.a1 = a1;
        this.b1 = b1;
        this.a2 = a2;
        this.b2 = b2;
    }

    void add()
    {
        int a, b;

        a = a1 + a2;
        b = b1 + b2;

        System.out.println("Sum -> Real: " + a + " Imaginary: " + b + "i");
    }

    void subtract()
    {
        int a, b;

        a = a1 - a2;
        b = b1 - b2;

        System.out.println("Difference -> Real: " + a + " Imaginary: " + b + "i");
    }

    void multiply()
    {
        int a, b;

        a = (a1 * a2) - (b1 * b2);
        b = (a1 * b2) + (b1 * a2);

        System.out.println("Product -> Real: " + a + " Imaginary: " + b + "i");
    }
    public static void main(String args[])
    {
        int a1, b1, a2, b2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the real part of the first number");
        a1 = sc.nextInt();
        System.out.println("Enter the imaginary part of the first number");
        b1 = sc.nextInt();
        System.out.println("Enter the real part of the second number");
        a2 = sc.nextInt();
        System.out.println("Enter the imaginary part of the second number");
        b2 = sc.nextInt();

        Complex numbers = new Complex(a1, b1, a2, b2);

        numbers.add();
        numbers.subtract();
        numbers.multiply();

        sc.close();
    }
}