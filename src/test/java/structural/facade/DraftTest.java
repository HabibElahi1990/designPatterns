package structural.facade;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by h.elahi on 11/12/2018.
 */
public class DraftTest {
    @Test
    public void calculate() throws Exception {
        Draft draft=new Draft();
        System.out.println(draft.calculate(1000000L,10));//700000
    }

}