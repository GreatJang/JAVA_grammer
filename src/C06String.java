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

////        ⭐String과 int의 형변환 외워야함
//        int a = 10;
//        String st_a = Integer.toString(a); // "10"
//        int c = Integer.parseInt(st_a); // 10
//
////        참조자료형에 원시자료형을 담을 때는 Wrapper 클래스를 써야한다. ex)컬렉션 프레임워크(List, set ...)
////        사용하는 이유는 다양한 기능을 사용하기 위해
//        List<Integer> list_a = new ArrayList<>();
//        list_a.add(10);
//        list_a.add(20);
//        list_a.add(30);
//        System.out.println(list_a);
//
//        int [] arr = new int[5];

////        String pool, String 객체
//        String mySt1 = new String("hello");
//        String mySt2 = new String("hello");
//        String mySt3 = "hello";
//        String mySt4 = "hello";
//        String mySt5 = mySt1;
//        System.out.println(mySt1 == mySt2); //false
//        System.out.println(mySt1 == mySt3); //false
//        System.out.println(mySt3 == mySt4); //true
//        System.out.println(mySt1 == mySt5); //St1과 St5의 힙메모리를 같은 주소를 바라보고있기 때문에 true

//        System.out.println(mySt1.equals(mySt2)); //true
//        System.out.println(mySt1.equals(mySt3)); //true
//        System.out.println(mySt3.equals(mySt4)); //true
//        System.out.println(mySt1.equals(mySt5)); //true

////        문자열길이 : length();
//        String mySt = " hello ";
//        System.out.println(mySt.length());
//
////        indexOf : 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치 반환
//        String mySt2 = "hello java java";
//        System.out.println(mySt2.indexOf("java")); // or
//        int myst_index = mySt2.indexOf("java");
//        System.out.println(myst_index);
//
////        contains : 특정 문자열이 있는지 여부를 boolean으로 리턴
//        String mySt3 = "hello java java";
//        System.out.println(mySt3.contains("java"));

//        charAt : 문자열에서 특정 위치(index)의 문자(char)를 리턴
        String st = "abcdefabaadf";
//        char myChar = st.charAt(1);
//        System.out.println(myChar);


//        반복문, charAt, length를 활용한 st안에 문자 a의 개수
        int count = 0;
        for(int i=0; i<st.length(); i ++){
            if(st.charAt(i) == 'a'){
                count ++;
            }
        }
        System.out.println("문자 a의 개수는 " + count + " 입니다.");

//        substring(a,b) : a이상 b미만의 index를 자른다.




    }
}
