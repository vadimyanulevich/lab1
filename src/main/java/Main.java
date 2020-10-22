import java.lang.*;
public class Main
{
    public static void main(String args[])
    {
        for(int i=0; i<args.length; i++) // go through the entire array args
        {
            int read_am=i; // variable to get shape parameters

            try
            {
                char shape = args[i].charAt(0); // Converting string to char (cant use switch with string)
                switch(shape)
                {
                    case 'o':  //case for circle
                        try
                        {
                            int n = Integer.parseInt(args[++read_am]); // circle radius
                            if(n<0)
                            {
                                System.out.println("Enter number >0 ");
                                continue;
                            }
                            else
                            {
                                Shape c = new Circle(n);
                                double ca = c.area();
                                double cp = c.perimeter();
                                System.out.println("Circle area: " + ca);
                                System.out.println("Circle perimeter: " + cp);
                                break;
                            }
                        }
                        catch(NumberFormatException ex)
                        {
                            System.out.println("Enter true number ");
                        }
                    case 'c': // case for rhombus, rectangle, and square
                        try
                        {
                            int n = Integer.parseInt(args[++read_am]); //
                            int n1 = Integer.parseInt(args[++read_am]);
                            int n2 = Integer.parseInt(args[++read_am]);
                            int n3 = Integer.parseInt(args[++read_am]);
                            int a = Integer.parseInt(args[++read_am]); //sides and angle of the quadrangle
                            if(n<0 || n1<0 || n2<0 || n3<0)
                            {
                                System.out.println("Enter number >0 ");
                                if(read_am<i)
                                {
                                    System.out.println("Enter numbers corectly");
                                }      continue;
                            }
                            else {//Rhombus
                                if (n == n1 && n1 == n2 && n2 == n3) {
                                    if (a == 90) {
                                        Shape sq = new Square(n);
                                        double sqa = sq.area();
                                        double sqp = sq.perimeter();
                                        System.out.println("Square area: " + sqa);
                                        System.out.println("Square perimeter: " + sqp);
                                        break;
                                    } else {// Square
                                        if (a > 0 && a < 180) {

                                            Shape m = new Rhombus(n, a);
                                            double ma = m.area();
                                            double mp = m.perimeter();
                                            System.out.println("Rhombus area: " + ma);
                                            System.out.println("Rhombus perimeter: " + mp);
                                            break;
                                        }
                                    }
                                } else {
                                    if (a == 90 && n==n1 && n2== n3) {
                                        {//Rectangle
                                            Shape r = new Rectangle(n, n1, n2, n3, a);
                                            double ra = r.area();
                                            double rp = r.perimeter();
                                            System.out.println("Rectangle area: " + ra);
                                            System.out.println("Rectangle perimeter: " + rp);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        catch(NumberFormatException ex)
                        {
                            System.out.println("Enter true number" );
                        }

                    case 'p': // case for pentagon
                        try
                        {
                            int n = Integer.parseInt(args[++read_am]);
                            if(n<0)
                            {
                                System.out.println("Enter number >0 ");
                                continue;
                            }
                            else
                            {
                                Shape p = new Pentagon(n);
                                double pa = p.area();
                                double pp = p.perimeter();
                                System.out.println("Pentagon area: " + pa);
                                System.out.println("Pentagon perimeter: " + pp);
                                break;
                            }
                        }
                        catch(NumberFormatException ex)
                        {
                            System.out.println("Enter true number");
                        }
                    case 's': // case for hexagon
                        try
                        {
                            int n = Integer.parseInt(args[++read_am]);
                            if(n<0)
                            {
                                System.out.println("Enter number >0 ");
                                continue;
                            }
                            else
                            {
                                Shape h = new Hexagon(n);
                                double ha = h.area();
                                double hp = h.perimeter();
                                System.out.println("Hexagon area: " + ha);
                                System.out.println("Hexagon perimeter: " + hp);
                                break;
                            }
                        }
                        catch(NumberFormatException ex)
                        {
                            System.out.println("Enter true number");
                        }
                }
            }

            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Enter number(s) for shape(s) corectly! ");
            }
        }
    }
}