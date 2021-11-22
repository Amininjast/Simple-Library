package ir.javaCup.services;

import ir.javaCup.model.Member;
import ir.javaCup.view.io.IoMember;

import java.util.ArrayList;


public class MemberServices implements Services<Member> {
    public static ArrayList<Member> membersList = new ArrayList();
    static int memberCounter = 1;

    @Override
    public int add(Member member) {
        int id = memberCounter;
        member.setMemberId(id);
        membersList.add(member);
        IoMember.showAllMember();
        memberCounter++;
        return id;
    }

    public static Member searchByID(int id) {
        Member member2 = null;
        for (Member member : membersList) {
            if (member.getMemberId() == id) {
                member2 = member;
                break;
            }
        }
        return member2;
    }

    @Override
    public void update(int id) {
        if (!membersList.isEmpty()) {
            for (Member member : membersList) {
                if (member.getMemberId() == id) {
                    IoMember.createUpdateCommon(member);
                    break;
                } else {
                    IoMember.idNotFound();
                }
            }
        } else {
            IoMember.deleteMassageFailed();
        }
    }

    @Override
    public void delete(int id) {
        if (!membersList.isEmpty()) {
            for (Member member : membersList) {
                if (member.getMemberId() == id) {
                    IoMember.deleteMassage();
                    membersList.remove(member);
                    break;
                }
            }
        } else {
            IoMember.deleteMassageFailed();
        }
    }

}