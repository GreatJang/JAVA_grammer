package C13Inheritance_Test;

import C13Inheritance.C1304ProtectedClass;

public class ProtectedMain extends C1304ProtectedClass{
    public static void main(String[] args) {
        C1304ProtectedClass pt = new C1304ProtectedClass();
//        System.out.println(pt.st2); // default : 패키지내에서만 접근가능
//        System.out.println(pt.st3); // protected : 패키지를 벗어나더라도 상속관계인 경우엔 접근가능
//        System.out.println(pt.st4); // 다른패키지 이기때문에 public 접근 가능 // 프로젝트 전체에서 접근가능

//
        ProtectedMain pm = new ProtectedMain();
//        상속한 객체에서 protected 변수 접근 가능 // ProtectedMain이 C1304ProtectedClass를 상속하고 있음.
        System.out.println(pm.st3);
        System.out.println(pm.st4);

    }
}
