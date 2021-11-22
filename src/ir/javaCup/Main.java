package ir.javaCup;

import ir.javaCup.services.menu.MenuServices;
import ir.javaCup.view.menu.Menu;

public class Main {
    public static boolean menuLoop;

    public static void main(String[] args) {
        Menu menu=new Menu();
        menuLoop = true;
        do {
            MenuServices.menu(menu.showMenu());
        } while (menuLoop);
    }
}
