package creational.abstractFactory;

/**
 * Created by h.elahi on 11/6/2018.
 */
//use any class based on classCode for get result abstract class
public class FactoryClass_A implements FactoryClass {
    @Override
    public ImplementationFactoryClass createImplementationFactoryClass(FactoryClass.FactoryClassCode classCode) throws Exception {
        switch (classCode){
            case IMPLEMENTATION_FACTORY_CLASS_CODE_A:
                return new ImplementationFactoryClass_A();
            case IMPLEMENTATION_FACTORY_CLASS_CODE_B:
                return new ImplementationFactoryClass_B();
            case IMPLEMENTATION_FACTORY_CLASS_CODE_C:
                return new ImplementationFactoryClass_C();
        }
        throw new Exception("error class code");
    }
}
