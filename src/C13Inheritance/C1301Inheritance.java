package C13Inheritance;

//extends 키워드를 통해 상속관계를 표현
public class C1301Inheritance extends Parents{ // extends기준 왼쪽 클래스는 오른쪽 Parents의 기능을 상속받는다.
    int c = 30;
    public static void main(String[] args) {
        C1301Inheritance ih = new C1301Inheritance();
        System.out.println(ih.c);
        System.out.println(ih.a); // a는 부모꺼.
//        자식클래스라 하더라도 private변수는 상속 및 접근이 불가하다.
//        System.out.println(ih.b);

        ih.parentMethod();
        ih.childMethod();
    }
    void childMethod(){
        System.out.println("자식클래스입니다.");
    }
//    부모클래스의 메서드명을 동일하게 사용함으로서 메소드 오버라이딩(덮어쓰기)했다.
    @Override
    void parentMethod(){
        System.out.println("부모클래스가 아니라 자식클래스입니다.");
    }

}

class Parents{
    int a=10;
    private int b=20;
    void parentMethod(){
        System.out.println("부모클래스입니다.");
    }
}
