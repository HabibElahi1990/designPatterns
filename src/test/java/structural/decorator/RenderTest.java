package structural.decorator;

import org.junit.Test;

/**
 * Created by h.elahi on 11/12/2018.
 */
public class RenderTest {
    @Test
    public void write() throws Exception {
        Render submitInputElement =
                new SubmitInputElement(new Attribute("id", "input_1")
                        , new Attribute("value", "save"));


        StyleSheetRender sheetRender = new StyleSheetRender(submitInputElement, new Attribute("height", "200px"));

        //by StyleSheetRender we add attribute to  tag input
        System.out.println(sheetRender.write());//<div class='form-input' style="height:200px;"><input type='submit' id='input_1' value='save' /></div>

    }

}