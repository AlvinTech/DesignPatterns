package Adapter;

/**
 * Created by Alvin on 16/11/5.
 */
public class Circle extends  ICircle implements Shape{

    public Circle(double radius) {
        super(radius);
    }

    public String getPerimeter() {
        double result = super.perimeter();
        return String.format("%.2f", result);
    }

    public String getArea() {
        double result =  super.area();
        return String.format("%.2f",result);
    }
}
