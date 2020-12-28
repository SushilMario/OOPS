import java.util.Scanner;

abstract class Vehicle
{
    int year_of_manufacture;

    abstract void getData();
    abstract void putData();
}

class TwoWheeler extends Vehicle
{
    final int noOfWheels = 2;

    void getData()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the year of manufacture");
        year_of_manufacture = sc.nextInt();
    }

    void putData()
    {
        System.out.println("Manufactured in " + year_of_manufacture + ", has " + noOfWheels + " wheels");
    }
}

final class FourWheeler extends Vehicle
{
    final int noOfWheels = 4;

    void getData()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the year of manufacture");
        year_of_manufacture = sc.nextInt();
    }

    void putData()
    {
        System.out.println("Manufactured in " + year_of_manufacture + ", has " + noOfWheels + " wheels");
    }
}

class MyTwoWheeler extends TwoWheeler
{
    void getData()
    {
        super.getData();
    }

    void putData()
    {
        super.putData();
    }

    public static void main(String args[])
    {
        MyTwoWheeler bike = new MyTwoWheeler();

        bike.getData();
        bike.putData();
    }
}
