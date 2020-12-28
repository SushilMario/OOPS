import java.util.Scanner;
import java.util.Arrays;

class Operation
{
    static void perform()
    {
        Scanner sc = new Scanner(System.in);

        String str, word;
        int n, m;

        System.out.println("Enter a string");

        str = sc.nextLine();

        System.out.println("Enter the values of n and m");

        n = sc.nextInt();
        m = sc.nextInt();

        System.out.println("The substring is: " + str.substring(n, (n + m + 1)));

        System.out.println("Enter the word, in the previously entered string");

        word = sc.next();

        String arrayOfWords[] = str.split(" ");
        int count = 0;
        
        for(int i = 0; i < arrayOfWords.length; i++)
        {
            if(word.equals(arrayOfWords[i]))
            {
                count++;
            }
        }

        System.out.println("No of occurrences: " + count);

        String currentString, newString;

        System.out.println("Enter the word to be replaced");

        currentString = sc.next();

        System.out.println("Enter the one in its place");

        newString = sc.next();

        System.out.println("The new string: " + str.replace(currentString, newString));

        System.out.println("Enter a string to sort");

        String s = sc.next();

        char charArray[] = s.toCharArray();

        Arrays.sort(charArray);

        System.out.println("The string, in alphabetical order: " + (new String(charArray)));

        String s1, s2;
        int comparison;

        System.out.println("Enter two strings to compare without case, and concatenate");

        s1 = sc.next();
        s2 = sc.next();

        comparison = s1.compareToIgnoreCase(s2);

        if(comparison > 0)
        {
            System.out.println("String " + s1 + " is greater");
        }

        else if(comparison < 0)
        {
            System.out.println("String " + s2 + " is greater");
        }

        else
        {
            System.out.println("The strings are equal");
        }

        System.out.println("The concatenated string: " + s1.concat(s2));

        sc.close();
    }

    public static void main(String args[])
    {
        Operation.perform();
    }
}