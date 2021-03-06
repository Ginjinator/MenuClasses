package Data;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private final List<MenuChoice> _choices = new ArrayList<>();
    private static Scanner _keyboard = new Scanner(System.in);
    private String _title;
    private String _underlineTitle;

    private Menu() {
    }

    public Menu(String title) {
        _title = title;

        // TODO move this variable
        // The underline is created by replacing any char "." with a dash
        _underlineTitle = _title.replaceAll(".", "-");
    }
    //TODO move this method
    public MenuChoice displayAndChoose(ByteArrayInputStream in) {

        // Override keyboard input with an external bytestream
        _keyboard = new Scanner(in);

        return displayAndChoose();
    }

    // TODO Move this method
    public MenuChoice displayAndChoose() {
        boolean valid;
        int numericChoice = 0;
        do {
            display();
            System.out.print("Choice: ");
            String lineEntered = _keyboard.nextLine();
            try {
                numericChoice = Integer.parseInt(lineEntered);
                valid = (numericChoice >= 1) && (numericChoice <= (_choices.size()));
            } catch (Exception e) {
                valid = false;
            }

            if (!valid) {
                System.out.println("Invalid choice");
            }

        } while (!valid);

        return _choices.get(numericChoice - 1);

    }

    //TODO move this method
    private void display() {
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

    public void addMenuChoice(MenuChoice menuChoice) {
        _choices.add(menuChoice);
    }

}
