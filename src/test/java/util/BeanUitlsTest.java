package util;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;

/**
 * Created by Alvin on 16/11/10.
 */

public class BeanUitlsTest {

    private Person origin;
    private Person copy = new Person();

    @Before
    public void init(){
        origin = new Person(123l,"alvin","Zhejiang","15858178699",25,new Date());
    }

    @Test
    public void testSetBean(){
        HashMap<String, Object> map = new HashMap<String, Object>();
        map = BeanUtils.buckupProp(origin);
        System.out.println(map);
        BeanUtils.restoreProp(copy,map);
        copy.showInfo();
    }
}
