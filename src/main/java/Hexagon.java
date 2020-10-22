class Hexagon implements Shape
{
    private double side;
    Hexagon(double s)
    {
        side=s;
    }
    public double perimeter()
    {
        return 6*side;
    }
    public double area()
    {
        return (3*Math.pow(side, 2)*Math.sqrt(3))/2;
    }
}
