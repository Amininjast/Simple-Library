package ir.javaCup.view.menu;

import java.util.Scanner;

public class MemberMenu {
    public static Scanner input = new Scanner(System.in);

    public  int showMemberMenu() {
        System.out.println("1 for Create Member\n2 for Search By ID\n3 for Update Member\n" +
                "4 for Delete Member\n5 for show Members\n0 for exit");
        int selectedMenu = input.nextInt();
        return selectedMenu;
    }
}
