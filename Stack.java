import java.util.Scanner;

class Stack
{
    int stack[], top, size;

    Stack(int size)
    {
        top = -1;

        this.size = size;

        stack = new int[size];
    }

    void push(int element)
    {
        if(top == stack.length - 1)
        {
            System.out.println("Stack overflow!");

            return;
        }

        stack[++top] = element;
    }

    void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack underflow!");

            return;
        }

        --top;
    }

    void display()
    {
        if(top == -1)
        {
            System.out.println("Stack empty!");

            return;
        }

        for(int i = top; i >= 0; i--)
        {
            System.out.println(stack[i]);
        }
    }

    public static void main(String args[])
    {
        int size, element;
        Stack stack;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the stack");
        size = sc.nextInt();

        stack = new Stack(size);

        for(int i = 0; i < size; i++)
        {
            System.out.println("Element " + (i + 1)); 
            element = sc.nextInt();

            stack.push(element);
        }

        stack.display();

        stack.pop();
        stack.pop();

        stack.display();

        sc.close();
    }
}