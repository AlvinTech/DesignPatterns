package Adapter;

import lombok.Data;

/**
 * Created by Alvin on 16/11/5.
 */
@Data
public class ICircle {

    private double radius;

    public ICircle(double radius){
        this.radius = radius;
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

}
