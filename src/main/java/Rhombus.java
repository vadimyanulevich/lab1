class Rhombus extends Quadrangle
{
    private final double side, angle;
    Rhombus(double s, double a)
    {
        side=s;
        angle=a;
    }

    public double perimeter()
    {
        return 4*side;
    }
    public double area()
    {
        return Math.pow(side, 2)*Math.sin(Math.toRadians(angle));
    }
}
