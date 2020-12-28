import java.util.Scanner;

class Bubble
{
    static void sort(int array[], int N)
    {
        int temp;

        for(int i = 0; i < N - 1; i++)
        {
            for(int j = 0; j < N - i - 1; j++)
            {
                if(array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("The sorted array is :-");

        for(int i = 0; i < N; i++)
        {
            System.out.println(array[i]);
        }
    }

    public static void main(String args[])
    {
        int array[], size;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        size = sc.nextInt();

        array = new int[size];

        System.out.println("Enter the " + size + " numbers");

        for(int i = 0; i < size; i++)
        {
            array[i] = sc.nextInt();
        }

        Bubble.sort(array, size);

        sc.close();
    }
}