package structural.bridge;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by h.elahi on 11/10/2018.
 */
public class ShapeTest {
    //using Color implements instead create class for any Shape like BlueCircle ,GreenCircle , ...
    @Test
    public void applyColor() throws Exception {
        Color blueColor=new BlueColor();
        Shape circle=new Circle(blueColor);
        System.out.println("circle");
        circle.applyColor();
        System.out.println("/*************************************/");
        Square square = new Square(blueColor);
        System.out.println("circle");
        square.applyColor();
        System.out.println("/*************************************/");

    }

}