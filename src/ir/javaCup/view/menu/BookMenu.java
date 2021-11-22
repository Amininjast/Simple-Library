package ir.javaCup.view.menu;

import java.util.Scanner;

public class BookMenu  {
    public static Scanner input = new Scanner(System.in);

    public  int showBookMenu() {
        System.out.println("1 for Create Book\n2 for Search By ID\n3 for Update Book\n4 for Delete Book\n" +
                "5 for show Books\n6 for lending Book\n7 for return Book\n8 for show Histoy Of Borrow\n" +
                "9 for show Unreturned Book\n0 for exit");
        int selectedMenu = input.nextInt();

        return selectedMenu;
    }

}
