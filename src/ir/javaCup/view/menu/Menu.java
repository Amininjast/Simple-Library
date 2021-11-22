package ir.javaCup.view.menu;

import java.util.Scanner;

public class Menu {
    public static Scanner input = new Scanner(System.in);

    public  int showMenu() {
        System.out.println("1 for Member Menu \n2 for Book Menu \n0 for Exit");
        int selectedMenu = input.nextInt();
        return selectedMenu;
    }
}