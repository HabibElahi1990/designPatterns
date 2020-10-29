package structural.bridge;

/**
 * Created by h.elahi on 11/10/2018.
 */
public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    //use method applyColor in Color implements class
    @Override
    void applyColor() {
        getColor().applyColor();
    }

}
