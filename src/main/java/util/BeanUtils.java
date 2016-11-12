package util;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * Created by Alvin on 16/11/10.
 */
public class BeanUtils {
    public static HashMap<String, Object> buckupProp(Object bean){
        HashMap<String,Object> result = new HashMap<String, Object>();
        try{
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor descriptor : descriptors){
                String name = descriptor.getName();
                Method method = descriptor.getReadMethod();
                Object fieldValue =  method.invoke(bean,new Object[]{});
                // every class will have this "class" property.
                if(!name.equalsIgnoreCase("class")){
                    result.put(name,fieldValue);
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
        return result;
    }


    public static void restoreProp(Object bean, HashMap<String,Object> propMap){
        try {
            BeanInfo info = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] descriptors = info.getPropertyDescriptors();
            for (PropertyDescriptor descriptor : descriptors){
                String name = descriptor.getName();
                Class type = descriptor.getPropertyType();
                if(type.getName().equals("java.lang.String")){
               //     System.out.println(name);
                }
                if(propMap.containsKey(name)){
                    Method method = descriptor.getWriteMethod();
                    method.invoke(bean, new Object[]{propMap.get(name)});
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
