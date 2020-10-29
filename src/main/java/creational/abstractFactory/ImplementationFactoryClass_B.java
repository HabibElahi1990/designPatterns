package creational.abstractFactory;

/**
 * Created by h.elahi on 11/6/2018.
 */
public class ImplementationFactoryClass_B extends ImplementationFactoryClass {

    public ImplementationFactoryClass_B() {
        super();
    }

    @Override
    public String getString() {
         return FactoryClass.FactoryClassCode.IMPLEMENTATION_FACTORY_CLASS_CODE_B.name();
    }
}
