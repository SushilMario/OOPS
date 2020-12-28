class Box
{
    double width, height, depth;
    
    Box()
    {
        width = 1;
        height = 1;
        depth = 1;
    }

    double volume()
    {
        return width * height * depth;
    }
}

class BoxDemo
{
    public static void main(String[] args) 
    {
        Box box = new Box();
        System.out.println(box.volume());
    }
}