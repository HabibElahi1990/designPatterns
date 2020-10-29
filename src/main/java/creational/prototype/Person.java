package creational.prototype;

/**
 * Created by h.elahi on 08/11/2018.
 */

/**
 * this class person ih a sample about prototype design pattern
 * this class use builder pattern
 * in prototype design pattern you can create many objects of one object by use clone method
 */
public class Person implements Cloneable {

    private String firstName;
    private String lastName;
    private String nationalCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public Person() {
    }

    public Person(String firstName, String lastName, String nationalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalCode = nationalCode;
    }

    //Override method clone and change body
    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    //create createBuilder method for new PersonBuilder() and use another class
    public static PersonBuilder createBuilder(){
        return new PersonBuilder();
    }

    //inner class PersonBuilder
    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private String nationalCode;

        public PersonBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder setNationalCode(String nationalCode) {
            this.nationalCode = nationalCode;
            return this;
        }

        public Person createPerson() {
            return new Person(firstName, lastName, nationalCode);
        }
    }
}
