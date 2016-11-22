package flyweight;

import lombok.Data;

/**
 * Created by Alvin on 16/11/21.
 */
@Data
public abstract class Flyweight {

    private int id;

    private String location;

    private String subject;

    private int age;
}
