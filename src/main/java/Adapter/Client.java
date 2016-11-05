package Adapter;

/**
 * Created by Alvin on 16/11/5.
 */

/*
系统中原有已经实现的ICircle类。
现在由于新功能要求，要求所有的图形类需要继承 Shape 接口。
因此原先实现的ICircle就不满足现在的要求。而且接口的返回值有严格要求。

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
