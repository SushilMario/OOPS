import ISE.ISE_Department;

public class MainClass extends ISE_Department
{
    public static void main(String args[])
    {
        ISE_Department faculty[] = ISE_Department.createFaculty();

        System.out.println("Details of experienced faculty :-");

        for(int i = 0; i < ISE_Department.n; i++)
        {
            if(faculty[i].years_of_experience >= 20)
            {
                faculty[i].print_data();
                faculty[i].print_number_designations();
                faculty[i].number_research_consultancy_projs();
            }
        }
    }
}