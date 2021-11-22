package ir.javaCup.services.menu;

import ir.javaCup.Main;
import ir.javaCup.model.Member;
import ir.javaCup.services.BookServices;
import ir.javaCup.services.BorrowServices;
import ir.javaCup.services.MemberServices;
import ir.javaCup.view.io.IoBook;
import ir.javaCup.view.io.IoBorrow;
import ir.javaCup.view.io.IoMember;
import ir.javaCup.view.menu.BookMenu;
import ir.javaCup.view.menu.MemberMenu;

public class MenuServices {
    public static void menu(int selectedMenu) {
        MemberMenu memberMenu=new MemberMenu();
        BookMenu bookMenu=new BookMenu();
        if (selectedMenu == 1) {
            MemberMenuService.memberMenu(memberMenu.showMemberMenu());
        }
        if (selectedMenu == 2) {
            BookMenuService.bookMenu(bookMenu.showBookMenu());
        }
        if (selectedMenu == 0) {
            Main.menuLoop = false;
        }
    }
}
