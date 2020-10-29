package creational.factoryMethod;

import creational.factoryMethod.impl.DefaultFactoryInterface1;
import creational.factoryMethod.impl.DefaultFactoryInterface2;

/**
 * Created by h.elahi on 11/5/2018.
 */
//create class FactoryMethod for Implementation FactoryMethod pattern
public class FactoryMethod {

    //result method string of any class is String and use DefaultFactoryInterface1 class and DefaultFactoryInterface2 class
    //just through FactoryMethod class
    public String checkMethod(Integer type,String str) {

        if(type.equals(0)){
            return new DefaultFactoryInterface1().checkMethod(type,str);
        }
        return new DefaultFactoryInterface2().checkMethod(type,str);
    }
}
