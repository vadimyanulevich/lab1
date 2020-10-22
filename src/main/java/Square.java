class Square extends Quadrangle
{
    private final double side;
    Square(double s)
    {
        side=s;
    }

    public double perimeter()
    {
        return 4*side;
    }
    public double area()
    {
        return Math.pow(side, 2);
    }
}
