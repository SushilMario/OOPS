import java.util.*;

class Queue_ArrayList 
{
    ArrayList<String> q;

    void enqueue() 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string to be inserted:");
        String str = sc.nextLine();
        
        q.add(str);
    }

    void dequeue() 
    {
        if(q.size() == 0) 
        {
            System.out.println("Underflow");
            return;
        }
        
        System.out.println("Element deleted is: " + q.get(0));
        
        q.remove(0);
    }

    void display() 
    {
        if(q.size() == 0) 
        {
            System.out.println("The queue is empty");
            return;
        }

        System.out.println("The queue :-");
        
        Iterator<String> itr = q.iterator();

        while(itr.hasNext())
        {
            String str = itr.next();
            System.out.println(str);
        }
    }
    public static void main(String[] args) 
    {
        int ch;
        Scanner sc = new Scanner(System.in);

        Queue_ArrayList queue = new Queue_ArrayList();

        queue.q = new ArrayList<String>();

        while(true) 
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