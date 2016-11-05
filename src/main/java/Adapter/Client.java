package Adapter;

/**
 * Created by Alvin on 16/11/5.
 */
public class Client {
    public static void main(String[] args) {
        ICircle iCircle = new ICircle(1.5);
        System.out.println(iCircle.area());
        System.out.println(iCircle.perimeter());

        System.out.println("=========  new interface  ========");
        Shape circle = new Circle(1.5);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}
