import Data.Menu;
import Data.MenuChoice;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class MenuTest {
    // TODO 09 - Test that valid menu choice returns the correct Data.MenuChoice instance
    private Menu _menu = new Menu("Test");
    MenuChoice _menuChoice01 = new MenuChoice("First one");
    MenuChoice _menuChoice02 = new MenuChoice("Second one");
    MenuChoice _menuChoice03 = new MenuChoice("Third one");

    @Before
    public void initMenu() {
        _menu.addMenuChoice(_menuChoice01);
        _menu.addMenuChoice(_menuChoice02);
        _menu.addMenuChoice(_menuChoice03);
    }

    @Test
    public void displayAndChoose__Choose_First__Equals_First() {
        // https://stackoverflow.com/a/6416179
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());

        //assertEquals(_menuChoice01, _menu.displayAndChoose(in));
    }

    @Test
    public void displayAndChoose__Choose_Invalid_Then_Choose_Second__Equals_Second() {
        // https://stackoverflow.com/a/6416179
        ByteArrayInputStream in = new ByteArrayInputStream("0\nasdf\n9\n2\n1".getBytes());
        System.setIn(in);

        //assertEquals(_menuChoice02, _menu.displayAndChoose(in));
    }
}
