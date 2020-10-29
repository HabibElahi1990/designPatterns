package creational.builder;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by h.elahi on 08/11/2018.
 */
public class BuilderPatternTest {
    @Test
    public void builder() throws Exception {
        //create object from BuilderPattern
        BuilderPattern builderPattern=new BuilderPattern();
        // set diff value and return object from Builder class
        Builder builder = builderPattern.value('H').value(21.3f).value(34L).value(32).value("Habib").builder();
        System.out.println(builder.toString());
    }

}