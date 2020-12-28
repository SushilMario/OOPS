import java.util.*;

class Queue_ArrayList 
{
    static int f = 0, r = -1;

    static int MAX = 5;

    ArrayList<String> q;

    boolean isEmpty() 
    {
        return (f > r);
    }

    boolean isFull()
    {
        return (r == MAX - 1);
    }

    void enqueue() 
    {
        if(isFull()) 
        {
            System.out.println("Overflow!");
            return;
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string to be inserted:");
        String str = sc.nextLine();

        r++;
        
        q.add(str);
    }

    void dequeue() 
    {
        if(isEmpty()) 
        {
            System.out.println("Underflow");
            return;
        }
        
        System.out.println("Element deleted is: " + q.get(f));
        f++;

        if(f > r) 
        {
            f = 0;
            r = -1;
        }
    }

    void display() 
    {
        if(isEmpty()) 
        {
            System.out.println("The queue is empty: ");
            return;
        }

        System.out.println("The queue is: ");
        
        for(int i = f; i <= r; i++) 
        System.out.println(q.get(i) + " ");
    }
    public static void main(String[] args) 
    {
        int ch;
        Scanner sc = new Scanner(System.in);

        Queue_ArrayList queue = new Queue_ArrayList();

        queue.q = new ArrayList<String>(MAX);

        while (true) 
        {
            System.out.println("Enter:\n1 to insert\t2 to delete\t3 to Display\t4 to Exit");

            ch = sc.nextInt();

            switch(ch) 
            {
                case 1:
                queue.enqueue();
                break;
                case 2:
                queue.dequeue();
                break;
                case 3:
                queue.display();
                break;
                case 4:
                System.exit(0);
                default:
                System.out.println("INVALID CHOICE");
                break;
            }
        }
    }
}