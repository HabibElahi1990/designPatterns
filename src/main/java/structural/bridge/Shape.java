package structural.bridge;

/**
 * Created by h.elahi on 11/10/2018.
 */
public abstract class Shape {
    //composite Color and use in implements Shape class
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    abstract void applyColor();

}
