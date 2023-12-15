package Java_Basic;

public class C1102StackFuntion2 {
    public static void main(String[] args) {
        System.out.println("main함수 시작");
        System.out.println(function1(1));
        System.out.println("main함수 끝");
    }

    static int function1(int a){ // 자기 자신을 계속 호출되어서 스택이 계속 쌓여서 스택 오버플로우 발생 StackOverflowError
//        재귀함수 // 특정한 조건을 넣어서 멈추게 한다. 나중에
        System.out.println("function1시작");
        System.out.println("function1끝");
        return function1(a*2);
    }
//
//    static int function2(int a) {
//        System.out.println("function2시작");
//        System.out.println("function2끝");
//        return function3(a*2);
//    }
//
//    static int function3(int a){
//        System.out.println("function3시작");
//        System.out.println("function3끝");
//        return a*2;
//
//    }
}
