package creational.abstractFactory;

/**
 * Created by h.elahi on 11/6/2018.
 */
public class ImplementationFactoryClass_A extends ImplementationFactoryClass {

    public ImplementationFactoryClass_A() {
        super();
    }

    @Override
    public String getString() {
        return FactoryClass.FactoryClassCode.IMPLEMENTATION_FACTORY_CLASS_CODE_A.name();
    }
}
