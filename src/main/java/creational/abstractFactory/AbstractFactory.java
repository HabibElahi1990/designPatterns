package creational.abstractFactory;

/**
 * Created by h.elahi on 11/6/2018.
 */
//create AbstractFactory class for Abstract Factory design pattern
public class AbstractFactory {

    public enum ImplementationAbstractClassType {
        FACTORY_CLASS_A
    }

    public static FactoryClass createImplementationAbstractClass(ImplementationAbstractClassType classType) throws Exception {
        switch (classType) {
            case FACTORY_CLASS_A:
                return new FactoryClass_A();
        }
        throw new Exception("classType is error");
    }
}
