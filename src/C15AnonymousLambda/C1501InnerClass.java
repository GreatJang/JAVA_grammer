package C15AnonymousLambda;

public class C1501InnerClass {
    public static void main(String[] args) {
        MemberInnerClass.StaticInnerClass si = new MemberInnerClass.StaticInnerClass();
        si.display();
        MemberInnerClass mi = new MemberInnerClass();
        mi.display();;
    }
}
//일반내부클래스
class MemberInnerClass{
//    static 내부 클래스
//    이 클래스는 C1501InnerClass의 정적멤버처럼 활용
    private int a;
    void display(){
        System.out.println("a의 값은 " + a);
    }

    static class StaticInnerClass { // static class는 MemberInnerClass. 으로 접근할 수 있는 클래스
        private int data;
        void display(){
            System.out.println("data값은 " + data + " 입니다.");
        }
    }
}