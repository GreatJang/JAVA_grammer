package C18Thread;

public class MainClass {
    public static void main(String[] args) {
//        상속방식으로 스레드 생성
        Thread etc1 =  new ExtendsThreadClass();
        etc1.start();

        Thread etc2 =  new ExtendsThreadClass();
        etc2.start();

        Thread etc3 =  new ExtendsThreadClass();
        etc3.start();
        new ExtendsThreadClass().start();
//        스레드 실행시 순차적으로 실행되지 않음에 유의

//        Thread 생성자로 Runnable객체를 주입하는 방식.
//        Thread클래스에 Runnable객체가 전달되어 사용자가 직접 정의한 run 메서드가 실행
        new Thread(new RunnableImplementsClass()).start(); // Thread 생성자로 Runnable객체를 주입
        new Thread(() -> System.out.println("익명객체 스레드")).start(); // 람다방식
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("익명객체 스레드");
//            }
//        });


//        thread의 동시성 이슈 테스트
//        단일 스레드 일반호출
//        for(int i=0; i<1000; i++){
//            Library.borrowBook();
//        }
//        System.out.println("최종 남은 수량 " + Library.bookcount);


        for(int i=0; i<1000; i++){
            Thread th = new Thread(() -> Library.borrowBook());
            th.start();
        }
        System.out.println("최종 남은 수량 " + Library.bookcount);







    }
}
