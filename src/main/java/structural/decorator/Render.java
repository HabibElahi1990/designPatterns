package structural.decorator;
import java.util.Arrays;

/**
 * Created by h.elahi on 11/12/2018.
 */
public abstract class Render {

    private Attribute[] attributes;

    public Render(Attribute... attributes) {
        this.attributes = attributes;
    }

    public Render() {
    }

    public Attribute[] getAttributes() {
        return attributes;
    }

    public abstract String write();

    protected String writeAttributes(Attribute... attributes) {
        String result;
        if (attributes != null) {
            result = Arrays.stream(attributes)
                    .filter(attr -> attr.getValue() != null && attr.getName() != null)
                    .map(attr -> attr.getName() + "='" + attr.getValue() + "' ")
                    .reduce("", String::concat);
        } else {
            result = "";
        }
        return result;
    }

    protected String writeAttributesAsStyle(Attribute... attributes) {
        String result;
        if (attributes != null) {
            result = Arrays.stream(attributes)
                    .filter(attr -> attr.getValue() != null && attr.getName() != null)
                    .map(attr -> attr.getName() + ":" + attr.getValue() + ";")
                    .reduce("", String::concat);
        } else {
            result = "";
        }
        return result;
    }
}
