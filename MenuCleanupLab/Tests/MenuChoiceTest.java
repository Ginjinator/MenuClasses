import Data.MenuChoice;
import org.junit.Test;

import static org.junit.Assert.*;

public class MenuChoiceTest {
    // TODO 08 - A test to create a menu choice, and ensure getText() returns what you expect
    @Test
    public void getText__Create_Menu_Choice__Returns_Menu_Text() {
        String menuText = "some text";
        MenuChoice mc = new MenuChoice(menuText);
        assertEquals(menuText, mc.getText());
    }

}
