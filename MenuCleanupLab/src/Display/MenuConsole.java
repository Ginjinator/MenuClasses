package Display;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import Data.*;

public class MenuConsole {
    private final List<MenuChoice> _choices = new ArrayList<>();
    private String _title;
    private String _underlineTitle;
    private Menu _menu;

    public MenuConsole(Menu menu) {
        this._menu = menu;
        //this._title = menu.getTitle();
    }

    public MenuChoice displayAndChoose(ByteArrayInputStream in){
        return displayAndChoose();
    }

    public MenuChoice displayAndChoose(){
        this.display();
        return new MenuChoice("Stubbed out");
    }

    private void display(){
        System.out.println();
        System.out.printf(".-%s-.%n", _underlineTitle);
        System.out.printf("| %s |%n", _title);
        System.out.printf("'-%s-'%n", _underlineTitle);

        int numericLabel = 0;
        for (MenuChoice choice : _choices) {
            numericLabel++;
            System.out.println(numericLabel + ") " + choice.getText());
        }
    }
}
