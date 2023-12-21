//package C14Interface;
//
//public class InterfaceMain {
//    public static void main(String[] args) {
//        AnimalInterface1 myCat = new CatImplements();
//        myCat.makesound();
//        AnimalInterface1 myDog = new DogImplements();
//        myDog.makesound();
//
////        다형성이란 하나의 객체가 여러개의 참조변수타입을 가질 수 있음을 의미
//        AnimalInterface1 myMulticat = new CatMultiImplements();// 하나의 객체 // 여러개의 참조변수
//        myMulticat.makesound();
//////        타입을 interface1으로 선언하면 interface2에 정의된 메서드는 사용불가
////        System.out.println(myMulticat.play("고양이","강아지"));
////        AnimalInterface2 myMultidog = new DogMultiImplements();
//////        타입을 interface1으로 선언하면 interface2에 정의된 메서드는 사용불가
////        myMultidog.makesound();
////        System.out.println(myMultidog.play("강아지", "고양이"));
//
//
////        기본적으로 추상클래스, 인터페이스는 객체 생성이 불가능하나, 익명내부클래스 방식으로 사용가능
//        AnimalInterface1 ai = new AnimalInterface1() {
//            @Override
//            public void makesound() {
//
//            }
//        };
//
//    }
//}
