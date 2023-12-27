package C18Thread;

//Thread클래스에 이미 구현되어있는 run메서드는 아무작업도 하지않는 빈 메서드
//작업하고 싶은 내용을 run()메서드를 overriding하여 정의할 수 있다.
//상속관계이다 보니, 다른 클래스 상속불가 : 단점 -> Runnalbe대체
public class ExtendsThreadClass extends Thread{
//    run메서드는 스레드가 시작되면 실행된다.
    @Override
    public void run(){
        System.out.println("ExtendsThreadClass :" + Thread.currentThread().getName());
    }
}
