import java.util.Scanner;

class Circle
{
    double r;
    static final double pi = 3.141;

    Circle(double r)
    {
        this.r = r;
    }

    double returnCircleArea()
    {
        return pi * r * r;
    }
}

class Sector extends Circle
{
    double theta;

    Sector(double r, double theta)
    {
        super(r);

        this.theta = theta;
    }

    double returnSectorArea()
    {
        return 0.5 * r * r * theta;
    }
}

class Segment extends Circle
{
    double h;

    Segment(double r, double h)
    {
        super(r);

        this.h = h;
    }

    double returnSegmentArea()
    {
        return ((r * r) * ((r - h) / r)) - ((r - h) * Math.sqrt((2 * r * h - h * h)));
    }
}
 
class Circular
{
    public static void main(String args[])
    {
        double r, theta, h;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle and length of the segment in centimetres, and the central angle of the sector in radians");
        r = sc.nextDouble();
        h = sc.nextDouble();
        theta = sc.nextDouble();

        Circle circle = new Circle(r);
        System.out.println("Area of the circle: " + circle.returnCircleArea());

        Segment segment = new Segment(r, h);
        System.out.println("Area of the segment: " + segment.returnSegmentArea());

        Sector sector = new Sector(r, theta);
        System.out.println("Area of the sector: " + sector.returnSectorArea());

        sc.close();
    }
}