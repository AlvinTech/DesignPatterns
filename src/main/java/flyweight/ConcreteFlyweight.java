package flyweight;

import lombok.Data;

/**
 * Created by Alvin on 16/11/21.
 */

@Data
public class ConcreteFlyweight extends Flyweight{
    //使用科目和考试地点作为外部状态
    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
        String[] values = key.split(":");
        super.setSubject(values[0]);
        super.setLocation(values[1]);
    }
}
