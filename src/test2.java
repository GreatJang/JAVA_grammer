import java.util.*;
public class test2{
    public static void main(String[] args) {
        EnumStudent s1 = new EnumStudent();
        s1.setName("hong1");
        s1.setClassGrade(ClassGrade.A1);

        EnumStudent s2 = new EnumStudent();
        s2.setName("hong2");
        s2.setClassGrade(ClassGrade.A2);

        EnumStudent s3 = new EnumStudent();
        s2.setName("hong3");
//        타입이 여전히 String타입이므로, 클래스변수를 사용하지 않을수도 있다. // 원하는 타입을 그냥 넣어버릴수도 있음
        s2.setClassGrade("third");

        EnumStudent s4 = new EnumStudent();
        s4.setName("hong4");
//        String으로 세팅불가 -> 타입까지 체크하므로
//        Enum타입 사용시에는 static final 변수와 동일한 방법으로 사용
        s4.setRole(Role.GENERAL_USER);
        System.out.println(s4.getRole());
        System.out.println(s4.getRole().getClass());
//        enum값 내부에는 저장된 순서대로 0부터 index값이 내부적으로 할당
        System.out.println(s4.getRole().ordinal());
    }
}
class ClassGrade{
    static final String A1 = "first_grade";
    static final String A2 = "second_grade";
    static final String A3 = "third_grade";
}
enum Role{
    GENERAL_USER, ADMIN_USER, SUPER_USER;
}



class EnumStudent{
    private String name;
//    소속반
    private String ClassGrade;
    private Role role;
//    String 타입이 아닌 Role타입을 신규로 지정
//    Role enum클래스를 사용하도록 타입을 Role로 설정해주어야함 //Role 타입

    public String getName() {
        return name;
    }

    public String getClassGrade() {
        return ClassGrade;
    }

    public Role getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassGrade(String classGrade) {
        ClassGrade = classGrade;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}