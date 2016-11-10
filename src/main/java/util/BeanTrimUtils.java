package util;

import java.beans.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Alvin on 16/11/10.
 */
public class BeanTrimUtils {
    public static void trimProperty(Object bean){
        try {
            BeanInfo info = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] descriptors = info.getPropertyDescriptors();
            for (PropertyDescriptor descriptor : descriptors){
                String name = descriptor.getName();
                Method getter = descriptor.getReadMethod();
                Method setter = descriptor.getWriteMethod();
                Class type = descriptor.getPropertyType();
                if(getter != null && setter != null){
                    if(type.getName().equals("java.lang.String")){
                        String value = (String) getter.invoke(bean,new Object[]{});
                        if(value != null && value.trim().equals("")){
                            setter.invoke(bean,new Object[]{null});
                        }else if(value != null){
                            setter.invoke(bean,new Object[]{value.trim()});
                        }
                    }
                }
            }
        }
        catch (IntrospectionException e) {
            e.printStackTrace();
        }
        catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
