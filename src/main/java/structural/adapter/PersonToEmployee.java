package structural.adapter;

/**
 * Created by h.elahi on 08/11/2018.
 */
// this class convert Person to employee
public class PersonToEmployee extends Employee {

    private Person person;

    public PersonToEmployee(Person person) {
        this.person = person;
    }

    @Override
    public String getCertificateNumber() {
        return person.getNationalCode();
    }

    @Override
    public String getFirstName() {
        return person.getFirstName();
    }

    @Override
    public String getLastName() {
        return person.getLastName();
    }

    @Override
    public String getNationalCode() {
        return super.getNationalCode();
    }
}
