package creational.prototype;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by h.elahi on 08/11/2018.
 */
public class PersonTest {
    @Test
    public void createBuilder() throws Exception {
        //create builder class
        Person.PersonBuilder builder = Person.createBuilder();
        //set field value
        Person person = builder.setFirstName("Habib").setLastName("Elahi").setNationalCode("119").createPerson();
        System.out.println(person.hashCode());//1915503092
        //clone of class person
        /*
        *if you use Object class in Person class not created new HashMap for it
        * for example if you use ImagePerson class into Person class
        * ImagePerson has a HashMap like 123
        * after clone ImagePerson into personClone has a HashMap 123
         */
        Person personClone = person.clone();
        System.out.println(personClone.hashCode());//1535128843
    }

}