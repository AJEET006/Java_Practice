package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       List<Double> list = new ArrayList<>();
       list.add(10.0);
       list.add(20.0);
       Polygon p = new Rectangle(list);
      System.out.println( p.getArea());       
    }

}
abstract class Polygon{
    List<Double> sides;
    public Polygon(List<Double> sides)
    {
        super();
        this.sides=sides;
    }
    public List<Double> getSides()
    {
        return sides;
    }
    public void setSides(List<Double> sides)
    {
        this.sides=sides;
    }
    public abstract double getArea();
}
class Rectangle extends Polygon
{
    public Rectangle(List<Double> sides)
    {
        super(sides);
    }
    @Override
    public double getArea()
    {
        double area = sides.get(0)*sides.get(1);
        return area;
    }
}
class Square extends Polygon
{
    public Square(List<Double> sides)
    {
        super(sides);
    }
    @Override
    public double getArea()
    {
        double area = sides.get(0)*sides.get(1);
        return area;
    }
}