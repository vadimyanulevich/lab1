class Rectangle extends Quadrangle
{
    private final double side1, side2, side3, side4, angle;
    Rectangle(double s1, double s2, double s3, double s4, double a)
    {
        side1=s1;
        side2=s2;
        side3=s3;
        side4=s4;
        angle=a;
    }

    public double perimeter()
    {
        return side1+side2+side3+side4;
    }
    public double area()
    {
        return Math.sqrt(((side1+side2+side3+side4)/2-side1)*((side1+side2+side3+side4)/2-side2)*((side1+side2+side3+side4)/2-side3)*((side1+side2+side3+side4)/2-side4)-side1*side2*side3*side4*Math.cos(Math.toRadians(angle)));
    }
}