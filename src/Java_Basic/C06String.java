package Java_Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

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
//        String st_a2 = String.valueOf(a);
//        int c = Integer.parseInt(st_a); // 10
//
////        ⭐참조자료형에 원시자료형을 담을 때는 Wrapper 클래스를 써야한다. ex)컬렉션 프레임워크(List, set ...)
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

////        반복문, charAt, length를 활용한 st안에 문자 a의 개수
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == 'a') {
                count++;
            }
        }
//        System.out.println("문자 a의 개수는 " + count + " 입니다.");

//        substring(a,b) : a이상 b미만의 index를 자른다.
//        String str1 = "hello world";
//        System.out.println(str1.substring(0,5));
//        System.out.println(str1.substring(6,str1.length()));

////        프로그래머스 가운데 글자 가져오기
////        s="abcde" => "c"
////        s="qwer" => "we"
//
//        String s = "qwer";
//        if(s.length() % 2 == 1) {
//            System.out.println(s.substring(s.length() / 2, s.length() / 2 + 1));
//        } else {
//            System.out.println(s.substring(s.length() / 2 - 1, s.length() / 2 + 1));
//        }

////        trim, strip
//        String trimSt = "    hello world   ";
//        String new_trimSt = trimSt.trim();
//        String stripSt = trimSt.strip();
//        System.out.println(new_trimSt);
//        System.out.println(stripSt);


////        toUppercase : 대문자, toLowercase : 소문자
//        String a = "Hello";
//        String a1 = a.toUpperCase();
//        String a2 = a.toLowerCase();
//        System.out.println(a1);
//        System.out.println(a2);

////        문자열 더하기 +=
//        String a = "hello";
//        a += "world";
//        System.out.println(a);
//
////        char -> String 형변환
//        char ch1 = 'a';
//        String st1 = Character.toString(ch1);

//        String str = "01abc123한글123";
////        알파벳만 빼고 문자를 str2에 새롭게 담기.
//        String str2 = " ";
//        for(int i=0; i<str.length(); i++){
//            char temp = str.charAt(i);
//            if(temp < 'a' || temp > 'z'){
//                str2 += Character.toString(temp);
//            }
//        }
//        System.out.println(str2);

//        특정 문자 제거하기 - 프로그래머스

////        replace(a,b) : a문자를 b문자로 대체
//        String st1 = "hello world";
//        String st2 = st1.replace("world", "java");
//        System.out.println(st2);
////        replaceAll(a,b)
//        String st3 = st1.replaceAll("world", "python");
//        System.out.println(st3);


//        String str = "01ZZabc1FF23한글123";
////        [a-z] : 소문자 알파벳
//        String str2 = str.replaceAll("[a-z]", "");
//        System.out.println(str2);
////        [가-힣] : 한글
//        String str3 = str.replaceAll("[가-힣]", "");
//        System.out.println(str3);
////        [0-9] : 숫자
//        String str4 = str.replaceAll("[0-9]", "");
//        System.out.println(str4);
////        [A-Za-z] : 알파벳 전체
//        String str5 = str.replaceAll("[A-Za-z]", "");
//        System.out.println(str5);
////        [A-Za-z0-9] : 알파벳 전체와 숫자
//        String str6 = str.replaceAll("[A-Za-z0-9]", "");
//        System.out.println(str6);

////        Pattern클래스
//        boolean matcher = Pattern.matches("[a-z]","helloworld");
//        System.out.println(matcher);

////        전화번호 검증
////        \d:숫자, {}:연속으로
//        boolean matcher2 = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$","010-123-1234");
//        System.out.println(matcher2);

////        이메일 검증
////        \d:숫자, {}:연속으로
//        boolean matcher3 = Pattern.matches("^[a-z0-9]+@[a-z]+.com$","hello@naver.com");
//        System.out.println(matcher3);

////        split : 리턴값은 String 배열
//        String a = "a:b:c:d";
//        String[] stArr = a.split(":");
//        System.out.println(Arrays.toString(stArr));
//
//        String b = "a  b c d";
//        String[] stArr2 = b.split(" ");
//        System.out.println(Arrays.toString(stArr2));
//        String[] stArr3 = b.split("\\s+");
//        System.out.println(Arrays.toString(stArr3));

////        isEmpty와 null구분
//        String st1 = null;
//        String st2 = "";
//
//        System.out.println(st1==null);
//        System.out.println(st2==null);
//        System.out.println(st2.isEmpty());
////        비어있는 것과 null은 다르다.
////        없는 값을 가지고 메서드를 사용하려고 해서 에러 : NullPointerException 예외 발생.
//        System.out.println(st1.isEmpty());
//
//        String[] arr = new  String[5];
//        arr[0] = "hello";
//        arr[1] = "world";
////        선언만 해놓은 상태에는 2,3,4은 null이다.
////        null인 없는 값에 연산을 하려고 하는 것 자체가 에러.
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i].length());
//        }


//        String[] 배열명 = {"a", "b", "c"};
//        => 1)배열선언 2)랭귀지 나열 3) join: 공백하나로 4) 출력
//        String.join(구분자, 배열명);

////        join : String[] -> String
//        String[] arr = {"java", "python", "C++", "javascript"};
//        String arrSt = String.join(" ", arr);
//        System.out.println(arrSt);

//        StringBuffer
//        출력시 StringBuffer 타입이므로 string으로 변경해주어야 한다.
        StringBuffer sb1 = new StringBuffer("hello");
        System.out.println(sb1);
        sb1.append(" world");
        System.out.println(sb1);
        sb1.insert(6,"java ");
        System.out.println(sb1);

        System.out.println(sb1.substring(6,10));
        sb1.delete(6,10);
        System.out.println(sb1);

//        성능 : String < StringBuffer < StringBuilder(스레드 safe X)
        StringBuilder sb2 = new StringBuilder("hello");
        sb2.append("world");
        System.out.println(sb2);

    }
}