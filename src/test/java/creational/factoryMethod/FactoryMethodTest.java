package creational.factoryMethod;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by h.elahi on 11/5/2018.
 */
public class FactoryMethodTest {
    @Test
    public void checkMethod() throws Exception {

        //get instance of FactoryMethod
        FactoryMethod factoryMethod=new FactoryMethod();
        //result String from method FactoryMethod based on method checkMethod of FactoryMethod class
        String factoryMethodStr = factoryMethod.checkMethod(1, "factoryMethod 1");
        System.out.println(factoryMethodStr);
        //change result because of argument type
        factoryMethodStr = factoryMethod.checkMethod(0, "factoryMethod 2");
        System.out.println(factoryMethodStr);

    }

}