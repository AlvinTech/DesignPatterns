package visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Alvin on 16/11/14.
 */
public class ObjectStructure {
    private  static  List<Employee> employeeList = new ArrayList<>();

    public static List<Employee> init(){
        Random random = new Random();
        for (int i =0 ; i < 10; i++){
            int value = random.nextInt(100);
            if(value < 50){
                employeeList.add(new Engineer("Employee_"+value,value, "work"+ value, value * 1000));
            }else{
                employeeList.add(new Manager("Manager_"+value,value, value, value * 1000));
            }
        }
        return employeeList;
    }

}
