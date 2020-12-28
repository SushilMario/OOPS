package ResultPackage;

import StudentPackage.*;

import java.util.Scanner;

public class Result extends RegisterStudent
{
    char grades[][];
    int SGPA[], CGPA;

    public void getMarks()
    {
        Scanner sc = new Scanner(System.in);

        credits = new int[4];

        marks = new int[4][5];

        for(int i = 0; i < 4; i++)
        {
            System.out.println("Enter credits for semester " + (i + 1));
            credits[i] = sc.nextInt();

            try 
            {
                if(credits[i] > 30)
                throw new CreditLimit("Too many credits!");
            } 
            catch(CreditLimit e) 
            {
                System.out.println(e);
                credits[i] = 30;
            }

            System.out.println("Enter 5 subject marks for semester " + (i + 1) + " (Out of 100)");

            for(int j = 0; j < 5; j++)
            {
                marks[i][j] = sc.nextInt();
            }
        }
    }

    public void assignGrades()
    {
        grades = new char[4][5];

        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                if(marks[i][j] >= 90)
                grades[i][j] = 'A';

                else if(marks[i][j] >= 80)
                grades[i][j] = 'B';

                else if(marks[i][j] >= 70)
                grades[i][j] = 'C';

                else if(marks[i][j] >= 60)
                grades[i][j] = 'D';

                else 
                grades[i][j] = 'F';
            }
        }
    }

    public void calculate()
    {
        SGPA = new int[4];
        CGPA = 0;

        for(int i = 0; i < 4; i++)
        {
            SGPA[i] = 0;

            for(int j = 0; j < 5; j++)
            {
                SGPA[i] += marks[i][j];
            }

            SGPA[i] /= 50;

            CGPA += SGPA[i];
        }

        CGPA /= 4;
    }

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

            System.out.println("SGPA - " + SGPA[i]);
        }

        System.out.println("CGPA - " + CGPA);
    }
}
