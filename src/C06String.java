import java.util.ArrayList;
import java.util.List;

public class C06String {
    public static void main(String[] args) {

////        참조자료형 : 기본 자료형을 제외한 모든 자료형
////        Wrapper class : 기본형 타입에 없는 다양한 기능을 지원하기 위한 클래스
////        int와 Integer간의 형변환
//        int a = 10;
//        Integer b = new Integer(20);
////        오토언박싱 : Integer -> int 형변환
//        int c = b;
////        언박싱 : Integer -> int 형변환
//        int d = b.intValue();
////        오토 박싱
//        Integer e = a;
////        박싱
//        Integer f = Integer.valueOf(a);

//        ⭐String과 int의 형변환 외워야함
        int a = 10;
        String st_a = Integer.toString(a); // "10"
        int c = Integer.parseInt(st_a); // 10

//        참조자료형에 원시자료형을 담을 때는 Wrapper 클래스를 써야한다. ex)컬렉션 프레임워크(List, set ...)
//        사용하는 이유는 다양한 기능을 사용하기 위해
        List<Integer> list_a = new ArrayList<>();
        list_a.add(10);
        list_a.add(20);
        list_a.add(30);
        System.out.println(list_a);

        int [] arr = new int[5];






    }
}
