package util;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * Created by Alvin on 16/11/10.
 */
public class BeanTrimUtilTest {
    private String name = "    a lvin    ";
    private Person person = new Person(123l,name,"    ",null,25,new Date());

    private  PropertyBean bean = new PropertyBean(name,"address","12345");

    @Test
    public void testTrimProperty(){
        person.showInfo();
        BeanTrimUtils.trimProperty(person);
        Assert.assertNull(person.getAddress());
        Assert.assertNull(person.getPhone());
        Assert.assertEquals(name.trim(), person.getName());
        person.showInfo();
    }

    @Test
    public void testValidTrimProperty(){
        BeanTrimUtils.trimProperty(bean);
        Assert.assertEquals(name.trim(), bean.getName());
        bean.showInfo();
    }
}
