class Pentagon implements Shape
{
    private double side;
    Pentagon(double s)
    {
        side=s;
    }
    public double perimeter()
    {
        return 5*side;
    }
    public double area()
    {
        return (5*Math.pow(side,2)*(1/Math.tan(Math.toRadians(36))))/4;
    }
}