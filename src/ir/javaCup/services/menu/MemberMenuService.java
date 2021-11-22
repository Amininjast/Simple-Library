package ir.javaCup.services.menu;

import ir.javaCup.model.Member;
import ir.javaCup.services.MemberServices;
import ir.javaCup.view.io.IoMember;

public class MemberMenuService {
    static MemberServices memberServices = new MemberServices();
    static IoMember ioMember = new IoMember();

    public static void memberMenu(int selectedMenu) {
        if (selectedMenu == 1) {
            ioMember.create();
        }
        if (selectedMenu == 2) {
            int memberId = IoMember.getMemberId();
            Member member = memberServices.searchByID(memberId);
            IoMember.showMember(member);
        }
        if (selectedMenu == 3) {
            memberServices.update(IoMember.getMemberId());
        }
        if (selectedMenu == 4) {
            memberServices.delete(IoMember.getMemberId());
        }
        if (selectedMenu == 5) {
            IoMember.showAllMember();
        }
        if (selectedMenu == 0) {
            return;
        }
    }
}
