import ResultPackage.*;

public class Results 
{
    public static void main(String args[])
    {
        Result student = new Result();
        student.get();
        student.getMarks();
        student.assignGrades();
        student.calculate();
        student.printResult();
    }
}
