package ResultPackage;

import StudentPackage.*;

public class Result extends RegisterStudent
{
    public void printResult()
    {
        System.out.println("Your grades for each subject are as follows :-");

        for(int i = 0; i < 4; i++)
        {
            System.out.println("Semester " + (i + 1));

            for(int j = 0; j < 5; j++)
            {
                System.out.println((j + 1) + " - " + grades[i][j]);
            }

            try
            {
                if(SGPA[i] > 10)
                {
                    throw new InvalidSGPA("SGPA cannot be greater than 10");
                }
            }
            catch(InvalidSGPA e)
            {
                System.out.println(e);
                SGPA[i] = 10;
            }

            System.out.println("SGPA - " + SGPA[i]);
        }

        System.out.println("CGPA - " + CGPA);
    }
}
