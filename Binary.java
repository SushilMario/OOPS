import java.util.Scanner;

class Binary
{
    static void search(int array[], int element)
    {
        int L = 0, H = array.length - 1, M, flag = -1;

        while(L<=H)
        {
            M = (L+H)/2;

            if(element == array[M])
            {
                System.out.println("Element found at index " + M);
                flag = 1;
                break;
            }

            else if(element < array[M])
            {
                H = H - M;
            }

            else
            {
                L = L + M;
            }
        }

        if(flag != 1)
        {
            System.out.println("The element was not found");
        }
    }

    public static void main(String args[])
    {
        int array[] = {1, 2, 3, 4, 5};
        Binary.search(array, 10);
    }
}