package C13Inheritance;

//super() : 상속관계에서 부모클래스의 생성자를 의미
//super키워드 : 부모클래스 의미
public class C1302SuperChildClass extends SuperParents{
    int b;
    int a;
    C1302SuperChildClass(){ // 부모생성자를 상속받고있기때문에 super로 할당해주어야함.
        super(100);
        a=30;
        b=20;

    }
    void display(){
        System.out.println(a);
        System.out.println(super.a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        C1302SuperChildClass sc = new C1302SuperChildClass();
        sc.display();
//        System.out.println(super.a); // static이어서 부모메소드 호출 불가
    }
}
class SuperParents{
    int a;
    SuperParents(int a){ // 부모클래스 생성자
        this.a = a;
    }
}
