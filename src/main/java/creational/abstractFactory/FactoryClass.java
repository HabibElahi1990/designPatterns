package creational.abstractFactory;

/**
 * Created by h.elahi on 11/6/2018.
 */
//create Factory Class class that is Implementation abstract class
public interface FactoryClass {
    public static enum FactoryClassCode{
        IMPLEMENTATION_FACTORY_CLASS_CODE_A,
        IMPLEMENTATION_FACTORY_CLASS_CODE_B,
        IMPLEMENTATION_FACTORY_CLASS_CODE_C,
    }
     ImplementationFactoryClass createImplementationFactoryClass(FactoryClass.FactoryClassCode classCode) throws Exception;
}

