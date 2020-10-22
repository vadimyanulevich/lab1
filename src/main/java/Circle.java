class Circle implements Shape
{
    private double radius;
    Circle(double r)
    {
        radius=r;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double area()
    {
        return Math.PI*Math.pow(radius,2);
    }
}