package C14Interface;

public class DogImplements implements AnimalInterface1{

    @Override
    public void makesound() {
        System.out.println("멍멍");
    }
}
class DogMultiImplements implements AnimalInterface1, AnimalInterface2{ // default 클래스 같은 패키지 이면 접근 가능

    @Override
    public void makesound() {
        System.out.println("멍멍");
    }
    @Override
    public String play(String a, String b) {
        return a + "와" + b + "가 놉니다.";
    }
}
