package C13Inheritance;

//import java.util.* : 가능, util 하위의 모든 클래스/인터페이스 파일 import 가능
//import java.* : 불가능, 특정 패키지의 하위패키지의 모든 파일까지 import하는 것은 불가능


//final클래스는 상속 불가
//public class C1305Others extends FinalClass{
public class C1305Others{
    public static void main(String[] args) {
        C1305Dog myDog = new C1305Dog();
        myDog.makesound1();
        myDog.makesound2();

        C1305Animal myAnimal = new C1305Animal() { // 익명객체
            @Override
            void makesound1() {

            }
        };
        System.out.println(myDog.getClass()); // class C13Inheritance.C1305Dog
        System.out.println(myAnimal.getClass()); // class C13Inheritance.C1305Others$1
//        Dog : 일반클래스 // Animal : abstract

    }

}
final class FinalClass{
}

abstract class C1305Animal{
//    final void makeSound(){
//        System.out.println("동물은 소리를 냅니다.");
//    }
    abstract void makesound1();
    void makesound2(){ // abstract class이지만 상속을 하기위해 일반 메소드를 가질 수 있다.
        System.out.println("makesound2");
    }
}
class C1305Dog extends C1305Animal{
    @Override
    void makesound1() {
        System.out.println("makesound1");
    }
//    final 메서드는 오버라이딩 불가
//    @Override
//    void makeSound(){
//        System.out.println("멍멍");
//    }
}
