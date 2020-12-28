package ISE;

import Faculty.*;
import java.util.Scanner;

public class ISE_Department extends Faculty implements Department
{
    public int number_designations, number_research_consultancy_projs;
    public static int n;

    public static ISE_Department faculty[];

    public void read_data()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, designation, age and years of experience");
        name = sc.next();
        designation = sc.next();
        age = sc.nextInt();
        years_of_experience = sc.nextInt();

        System.out.println("Enter your joining date");
        joining_date = sc.next();
        System.out.println("Enter the number of subjects you handle");
        subjects_handled = sc.nextInt();

        System.out.println("Enter the number of designations you hold, and the number of research / consultancy projects you are involved in");
        number_designations = sc.nextInt();
        number_research_consultancy_projs = sc.nextInt();
    }

    public void print_data()
    {
        System.out.println("Name: " + name + ", age: " + age + ", experience: " + years_of_experience + " years, joining date: " + joining_date + ", and subjects handled: " + subjects_handled);
    }

    public void print_number_designations()
    {
        System.out.println("You have " + number_designations + " designations");
    }

    public void number_research_consultancy_projs()
    {
        System.out.println("You are involved in " + number_research_consultancy_projs + " projects");
    }

    public static ISE_Department[] createFaculty()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of faculty members");
        n = sc.nextInt();

        faculty = new ISE_Department[n];

        for(int i = 0; i < n; i++)
        {
            System.out.println("Faculty member " + (i + 1));
            faculty[i] = new ISE_Department();
            faculty[i].read_data();

            try
            {
                if(faculty[i].age > 58)
                {
                    throw new AgeException("You are of retirement age");
                }
            }
            catch(AgeException e)
            {
                System.out.println(e);
            }
        }

        sc.close();

        return faculty;
    }
}