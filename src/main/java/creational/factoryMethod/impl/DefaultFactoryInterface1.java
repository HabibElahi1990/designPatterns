package creational.factoryMethod.impl;

import creational.factoryMethod.FactoryInterface;

/**
 * Created by h.elahi on 11/5/2018.
 */
public class DefaultFactoryInterface1 implements FactoryInterface {
    //implements from FactoryInterface
    @Override
    public String checkMethod(Integer type,String str) {
        return type+"/"+str;
    }
}
