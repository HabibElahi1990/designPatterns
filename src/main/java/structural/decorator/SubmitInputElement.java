package structural.decorator;

/**
 * Created by h.elahi on 11/12/2018.
 */
public class SubmitInputElement extends Render {

    public SubmitInputElement(Attribute... attributes) {
        super(attributes);
    }


    @Override
    public String write() {

        return "<input type='submit' " +
                writeAttributes(getAttributes()) +
                "/>";
    }
}
