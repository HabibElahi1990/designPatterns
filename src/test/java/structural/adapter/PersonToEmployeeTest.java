package structural.adapter;

import org.junit.Test;

/**
 * Created by h.elahi on 08/11/2018.
 */
/*
*this test class show we that Person class convert to Employee class
 * too. we access to values employee
*/
public class PersonToEmployeeTest {

    @Test
    public void adapter() throws Exception {

        Person person=new Person();
        person.setFirstName("Habib");
        person.setLastName("Elahi");
        person.setNationalCode("119");
        Employee employee=new PersonToEmployee(person);
        System.out.println(employee.getFirstName());//Habib

    }
}