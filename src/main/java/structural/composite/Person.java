package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by h.elahi on 11/11/2018.
 */
public abstract class Person {

    private String fullName;
    private String nationalCode;
    protected List<Person> childrenList = new ArrayList<>();

    public Person(String fullName, String nationalCode) {
        this.fullName = fullName;
        this.nationalCode = nationalCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    //create add and remove method child and not set into Person class
    public Person addChild(Person child) {
        throw new IllegalStateException("not set this level");
    }

    public Person removeChild(Person child) {
        throw new IllegalStateException("not set this level");
    }

    protected String printPerson() {
        return String.format("%s %s %n", fullName, nationalCode);
    }


    @Override
    public abstract String toString();
}
