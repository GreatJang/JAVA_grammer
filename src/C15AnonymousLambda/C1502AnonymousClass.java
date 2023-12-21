package C15AnonymousLambda;

public class C1502AnonymousClass {
    public static void main(String[] args) {

//        클래스명이 Animal이 아닌 이름없는 익명클래스와 객체를 동시에 생성.
        Animal dog = new Animal() { // 익명클래스에 대한 객체
            @Override
            public void makeSound(int n) {
                System.out.println("멍멍" + n);
            }
        };
//        - 상속을 받으려면 “신규 클래스명 extends 클래스”의 구조로 신규 클래스명을 가져야함
//        - 위의 소스 코드는 신규 클래스명이 존재하지 않는다.
//        - Overide를 통해 재정의하게 되었으므로, 본래의 클래스도 아니고 신규 상속 클래스도 아닌, 이름이 없는 익명의 클래스가 만들어짐과 동시에 익명객체가 생성
        dog.makeSound(10);

//        익명객체에 구현메서드가 1개밖에 없을경우에 람다표현식(화살표함수)로 표현가능
//        구현 메서드 makeSound()
//        ()부분에 매개변수 지정하여 구현체에서 활용, 변수의 개수가 많을때는 개수에 맞춰 지정
        Animal cat = (a) -> System.out.println("야옹" + a);
//        - 상속을 받으려면 “신규 클래스명 extends 클래스”의 구조로 신규 클래스명을 가져야함
//        - 위의 소스 코드는 신규 클래스명이 존재하지 않는다.
//        - Overide를 통해 재정의하게 되었으므로, 본래의 클래스도 아니고 신규 상속 클래스도 아닌, 이름이 없는 익명의 클래스가 만들어짐과 동시에 익명객체가 생성

    }
}

interface Animal{
    void makeSound(int n);
}
