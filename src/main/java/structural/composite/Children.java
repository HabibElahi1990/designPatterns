package structural.composite;

/**
 * Created by h.elahi on 11/11/2018.
 */
public class Children extends Person {
    public Children(String fullName, String nationalCode) {
        super(fullName, nationalCode);
    }

    @Override
    public String toString() {
        return "\t\tchildren : "+printPerson();
    }
}
