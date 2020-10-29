package structural.decorator;

/**
 * Created by h.elahi on 11/12/2018.
 */
public class Attribute {

    private String name ;
    private String value ;

    public Attribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
