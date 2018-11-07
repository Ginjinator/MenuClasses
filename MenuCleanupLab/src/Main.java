import Data.Menu;
import Data.MenuChoice;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu("Test");
        MenuChoice menuChoice01 = new MenuChoice("First one");
        MenuChoice menuChoice02 = new MenuChoice("Second one");
        MenuChoice menuChoice03 = new MenuChoice("Third one");

        menu.addMenuChoice(menuChoice01);
        menu.addMenuChoice(menuChoice02);
        menu.addMenuChoice(menuChoice03);

        MenuChoice chosen = menu.displayAndChoose();

    }
}
