import java.util.Scanner;

class Matrix
{
    int m1, n1, m2, n2;
    int A[][], B[][];

    Matrix(int m1, int n1, int m2, int n2)
    {
        Scanner sc = new Scanner(System.in);

        this.m1 = m1;
        this.n1 = n1;
        this.m2 = m2;
        this.n2 = n2;

        A = new int[m1][n1];
        B = new int[m2][n2];

        System.out.println("Enter the " + (m1 * n1) + " elements of matrix 1");

        for(int i = 0; i < m1; i++)
        {
            for(int j = 0; j < n1; j++)
            {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the " + (m2 * n2) + " elements of matrix 2");

        for(int i = 0; i < m2; i++)
        {
            for(int j = 0; j < n2; j++)
            {
                B[i][j] = sc.nextInt();
            }
        }

        sc.close();
    }

    void multiply()
    {
        if(m2 != n1)
        {
            System.out.println("The matrices cannot be multiplied");
            return;
        }

        int P[][] = new int[m1][n2];

        for(int i = 0; i < m1; i++)
        {
            for(int j = 0; j < n2; j++)
            {
                P[i][j] = 0;

                for(int k = 0; k < n1; k++)
                {
                    P[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("The product matrix is :-");

        for(int i = 0; i < m1; i++)
        {
            for(int j = 0; j < n2; j++)
            {
                System.out.print(P[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int m1, n1, m2, n2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows in the first matrix");
        m1 = sc.nextInt();
        System.out.println("Enter the number of columns in the first matrix");
        n1 = sc.nextInt();
        System.out.println("Enter the number of rows in the second matrix");
        m2 = sc.nextInt();
        System.out.println("Enter the number of columns in the second matrix");
        n2 = sc.nextInt();

        Matrix operation = new Matrix(m1, n1, m2, n2);

        operation.multiply();

        sc.close();
    }
}