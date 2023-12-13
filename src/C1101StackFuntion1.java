public class C1101StackFuntion1 {
    public static void main(String[] args) {
        System.out.println("main함수 시작");
        function1();
        System.out.println("main함수 끝");
    }

    static void function1(){
        System.out.println("function1시작");
        function2();
        System.out.println("function1끝");
    }

    static void function2(){
        System.out.println("function2시작");
        System.out.println("function2끝");
    }
}
