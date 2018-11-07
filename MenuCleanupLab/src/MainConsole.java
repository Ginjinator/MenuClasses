import Data.Menu;
import Data.MenuChoice;
import Display.MenuConsole;

public class MainConsole {
    public static void main(String[] args) {
        Menu menu = new Menu("Some title");
        MenuConsole menuConsole = new MenuConsole(menu);



        MenuChoice chosen = menuConsole.displayAndChoose();
        System.out.println("You chose: " + chosen.getText());
    }
}
