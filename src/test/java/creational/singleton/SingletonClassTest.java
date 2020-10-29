package creational.singleton;

import org.junit.Test;

/**
 * Created by habib.elahi1990 on 11/4/2018.
 */
public class SingletonClassTest {
    @Test
    public void getInstance() throws Exception {
        //if write new SingletonClass()
        //show constructor has a private access

        SingletonClass singletonClass1 = SingletonClass.getInstance();
        SingletonClass singletonClass2 = SingletonClass.getInstance();

        //hashCode from any instance from SingletonClass is equal
        System.out.println(singletonClass1.hashCode());//like 447422450
        System.out.println(singletonClass2.hashCode());//like 447422450


    }

}