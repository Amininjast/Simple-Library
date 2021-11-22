package ir.javaCup.model;

public class Member {
    private int memberId;
    private int age;
    private int gender;
    private String memberName;
    private boolean memberExistence;

    public Member() {
    }

    public Member(String memberName, int age, int gender) {
        setMemberName(memberName);
        setAge(age);
        setGender(gender);
        setMemberId(memberId);
    }


    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public boolean isMemberExistence() {
        return memberExistence;
    }

    public void setMemberExistence(boolean memberExistence) {
        this.memberExistence = memberExistence;
    }

    @Override
    public String toString() {
        return "Member{" +
//

                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", memberExistence=" + memberExistence +
                '}';
    }
}

