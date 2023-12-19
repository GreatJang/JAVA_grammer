package C13Inheritance;

public class C1303MethodOverriding {
    public static void main(String[] args) {
//        상속관계일때 부모클래스타입을 자식클래스객체의 타입으로 지정가능
//        Animal클래스에 정의된 메서드만 사용가능하도록 제약이 발생.
        Animal Animal = new Animal();
        Animal.sound();
        Dog myDog = new Dog();
        myDog.sound();
        Cat myCat = new Cat();
        myCat.sound();
        Animal myCat1 = new Cat(); // Animal 클래스에 Cat이 정의 되어 있기 때문에 Cat대신 Animal로 사용가능
        myCat.sound();
    }
}
class Animal{
    void sound(){
        System.out.println("동물은 소리를 냅니다.");
    }
}
class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("멍멍");
    }
}
class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("야옹");
    }
}
