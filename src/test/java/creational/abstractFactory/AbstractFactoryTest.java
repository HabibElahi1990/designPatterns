package creational.abstractFactory;

import creational.abstractFactory.AbstractFactory;
import creational.abstractFactory.FactoryClass;
import creational.abstractFactory.ImplementationFactoryClass;
import org.junit.Test;

/**
 * Created by h.elahi on 11/6/2018.
 */
public class AbstractFactoryTest {
    @Test
    public void createImplementationAbstractClass() throws Exception {
        //crete Factory from Abstract Factory
        FactoryClass implementationAbstractClass = AbstractFactory.createImplementationAbstractClass(AbstractFactory.ImplementationAbstractClassType.FACTORY_CLASS_A);
        //create implementation class from Abstract Factory implementation,s
        ImplementationFactoryClass implementationFactoryClass =
                implementationAbstractClass.createImplementationFactoryClass(FactoryClass.FactoryClassCode.IMPLEMENTATION_FACTORY_CLASS_CODE_B);
        //use only getString Method
        String classString = implementationFactoryClass.getString();//IMPLEMENTATION_FACTORY_CLASS_CODE_B
        System.out.println(classString);

        System.out.println(implementationAbstractClass.getClass().getName());//creational.abstractFactory.FactoryClass_A
        System.out.println(implementationFactoryClass.getClass().getName());//creational.abstractFactory.ImplementationFactoryClass_B

    }

}