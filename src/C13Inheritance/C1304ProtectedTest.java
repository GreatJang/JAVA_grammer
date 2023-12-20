package C13Inheritance;

public class C1304ProtectedTest extends C1304ProtectedClass{
    public static void main(String[] args) {
        C1304ProtectedClass pt= new C1304ProtectedClass(); // 객체 만들기
//        default 접근가능
        System.out.println(pt.st2);
//        protected 접근가능
        System.out.println(pt.st3);
//        public 접근가능
        System.out.println(pt.st4);

        C1304ProtectedTest pc = new C1304ProtectedTest(); // 객체를 C1304ProtectedTest로 만들어도 접근 동일하게 가능
        System.out.println(pc.st2);
        System.out.println(pc.st3);
        System.out.println(pc.st4);

    }
}
