package structural.composite;

import org.junit.Test;

/**
 * Created by h.elahi on 11/11/2018.
 */
public class PersonTest {
    @Test
    public void printPerson() throws Exception {
        Parent parent=new Parent("Habib Elahi","119");
        parent.addChild(new Children("Hosein Elahi","120"))
                .addChild(new Children("Ali Elahi","121"));


        Parent parent_123=new Parent("Habib Elahi_123","119");
        parent_123.addChild(new Children("Hosein Elahi_123","120"))
                .addChild(new Children("Ali Elahi_123","121"));
        parent.addChild(parent_123);

        System.out.println(parent.toString());
        //result is
        /*
        parent : Habib Elahi 119
             children : Hosein Elahi 120
             children : Ali Elahi 121
        parent : Habib Elahi_123 119
            children : Hosein Elahi_123 120
            children : Ali Elahi_123 121
         */


    }

}