import java.util.*;

class Linked_List 
{
    LinkedList<String> names;

    void add_name() 
    {
        Scanner sc = new Scanner(System.in);

        String a;

        System.out.println("Enter the name: ");
        a = sc.nextLine();

        // if (names.size() == 0) names.add(a); else names.addLast(a);
        names.add(a);
    }

    void display() 
    {
        if(names.size() == 0) 
        {
            System.out.println("The list is empty");
            return;
        }

        System.out.println("Names of length less than 5: ");

        Iterator<String> itr = names.iterator();

        while(itr.hasNext()) 
        {
            String str = itr.next();

            if(str.length() < 5)
            {
                System.out.print(str + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int ch;
        Linked_List ll = new Linked_List();

        ll.names = new LinkedList<>();

        while (true) 
        {
            System.out.println("Enter:\n1 to add name\t2 to display names with length less than 5\t3 to Exit");
            ch = sc.nextInt();
            switch (ch) 
            {
                case 1:
                ll.add_name();
                break;
                case 2:
                ll.display();
                break;
                case 3:
                System.exit(0);
                default:
                System.out.println("INVALID CHOICE");
                break;
            }
        }
    }
}