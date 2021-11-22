package ir.javaCup.view.io;

import ir.javaCup.model.Member;
import ir.javaCup.services.MemberServices;

import java.util.Scanner;

public class IoMember {
    public static Scanner input = new Scanner(System.in);
    static MemberServices memberServices = new MemberServices();

    public static void createUpdateCommon(Member member) {
        System.out.println("enter name age 0 for female , 1 for male");
        member.setMemberName(input.next());
        member.setAge(input.nextInt());
        member.setGender(input.nextInt());
        member.setMemberExistence(true);
    }

    public static void create() {
//        MemberServices memberServices=new MemberServices();
        Member member = new Member();
        createUpdateCommon(member);
//        member.setMemberId(memberCounter);
//        memberServices.add(member);
        System.out.println("ID is : " + memberServices.add(member));
//        memberCounter++;
    }

    public static int getMemberId() {
        System.out.println("Press Member id");
        int id = input.nextInt();
        return id;
    }

    public static void showMember(Member member) {
        System.out.println(member);
    }

    public static void showAllMember() {
        if (!MemberServices.membersList.isEmpty()) {
            for (Member member : MemberServices.membersList) {
                System.out.println(member);
            }
        } else {
            System.out.println("No member available\n");
        }
    }

    public static void deleteMassage() {
        System.out.println("deleted");
    }

    public static void deleteMassageFailed() {
        System.out.println("No member available\n");
    }

    public static void idNotFound() {
        System.out.println("you id wasn't found\n");
    }
}
