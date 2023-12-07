



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

////        라벨문 : 첫번째 for문 0~4까지, 2번째 for문 0~4까지, 2번째
//        loop1:
//        for(int i=0; i<5; i++){
//            loop2:
//            for(int j=0; j<5; j++){
//                System.out.println("hello world");
//                if(j==2){
//                    break loop1; //break; 하는것과 비교
//                }
//            }
//        }

//        int a = 24; int b = 36;
//        int num = a > b ? b : a;
//        int maxNum = 0;
//        for(int i=1; i<=num; i++){
//            if(a%i == 0 && b%i == 0){
//                maxNum = i;
//            }
//        }
//        System.out.println(maxNum);
//
//        int minNum = a/maxNum * b/maxNum * maxNum;
//        System.out.println(minNum);

////        라벨문 활용1
//        int[][] matrix = {{1,2,3,4},{5,6,7},{8,9},{10,11,12,13,14}};
//        int target = 11;
//        loop1:
//        for(int i=0; i<matrix.length; i++){
//            loop2:
//            for(int j = 0; j<matrix[i].length; j++){ // i번째 배열의 길이만큼
//                if(matrix[i][j] == target){
//                    System.out.println(i + ", " + j + " 번째에 있습니다.");
//                    break loop1;
//                }
//            }
//
//        }


////        라벨문 활용2
//        int answer = 0;
//        for(int i=0; i<21; i++){
//            int count = 0;
//            for(int j=1; j<=i; j++){
//                if(i % j == 0){
//                    count ++;
//                }
//            }
//            if(count >= 5){
//                answer = i;
//                System.out.println(answer);
//                break;
//            }
//        }

////        라벨문 적용
//        int answer = 0;
//        l1:
//        for(int i=0; i<21; i++){
//            int count = 0;
//            for(int j=1; j<=i; j++){
//                if(i % j == 0){
//                    count ++;
//                }
//                if(count == 5){
//                    answer = i;
//                    break l1;
//                }
//            }
//        }
//        System.out.println(answer);
//
////        참조자료형 : 기본 자료형을 제외한 모든 자료형
////        Wrapper class : 기본형 타입에 없는 다양한 기능을 지원하기 위한 클래스
////        int와 Integer간의 형변환
//        int a = 10;
//        Integer b = new Integer(20);
//
////        오토 언박싱 : Integer -> int 형변환
//        int c = b;
//
////        언박싱 : Integer -> int 형변환
//        int d = b.intValue();
//
////        오토 박싱
//        Integer e = a;
////        박싱
//        Integer f = Integer.valueOf(a);

////        String과 int의 형변환 외워야함
//        int a = 10;
//        String st_a = Integer.toString(a); // "10"
//        int c = Integer.parseInt(st_a); // 10 => String을 int 로 변환

////        참조자료형에 원시자료형을 담을 때는 Wrapper 클래스를 써야한다.
//        List<Integer> list_a = new ArrayList<>();
//        list_a.add(10);
//        list_a.add(20);
//        list_a.add(30);
//        System.out.println(list_a);

////        String pool, String 객체
//        String mySt1 = new String("hello");
//        String mySt2 = new String("hello");
//        String mySt3 = "hello";
//        String mySt4 = "hello";
//        String mySt5 = mySt1;
////      문자열 비교시 .equals 사용
//        System.out.println(mySt1 == mySt2);
//        System.out.println(mySt1 == mySt3);
//        System.out.println(mySt3 == mySt4);
//        System.out.println(mySt1 == mySt5);
//
//        System.out.println(mySt1.equals(mySt2));
//        System.out.println(mySt1.equals(mySt3));
//        System.out.println(mySt1.equals(mySt4));
//        System.out.println(mySt1.equals(mySt5));
////        문자열 길이 : length();
//        String mySt = " hello ";
//        System.out.println(mySt.length());
//
////        indexOf : 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치 반환
//        String mySt2 = "hello java java";
//        System.out.println(mySt2.indexOf("java")); //or
//        int myst_index = mySt2.indexOf("java");
//        System.out.println(myst_index);

////        contains : 특정 문자열이 있는지 여부를 boolean으로 리톤
//        String mySt3 = "hello java java";
//        System.out.println(mySt3.contains("java"));
//
////        charAt : 문자열에서 특정 위치(index)의 문자 (char)를 리턴
//        String st = "abcdefabaadf";
////        char myChar = st.charAt(1);
////        System.out.println(myChar);
//
////        반복문, charAt, length를 활용한 st안에 문자 a의 개수
//        int count = 0;
//        for(int i = 0; i < st.length(); i++) {
//            if (st.charAt(i) == 'a') {
//                count++;
//            }
//        }
//        System.out.println("문자 a의 개수는 " + count + " 입니다.");


////        substring(a,b) : a이상 b미만의 index를 자른다.
//        String str1 = "hello world";
//        System.out.println(str1.substring(0,5));
//        System.out.println(str1.substring(6, str1.length()));

////        프로그래머스 가운데 글자 가져오기
//        String s = "qwer";
//        if(s.length() % 2 == 1){
//            System.out.println(s.substring(s.length() / 2, s.length()/2 +1));
//        } else {
//            System.out.println(s.substring(s.length()/ 2 -1, s.length()/2 + 1));
//        }

////        trim, strip
//        String trimSt = "    hello world    ";
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

////        char -> String 형변환
//        char ch1 = 'a';
//        String st1 = Character.toString(ch1);
//
//        String str = "01abc123한글123";
////        알파벳만 빼고 문자를 str2에 새롭게 담기.
//        String str2 = " ";
//        for(int i=0; i<str.length(); i++){
//            char temp = str.charAt(i);
//            if(temp < 'a' || temp > 'z') {
//                str2 += Character.toString(temp);
//            }
//        }
//        System.out.println(str2);

//        replace(a,b) : a문자를 b문자로 대체
        String st1 = "hello world";
        String st2 = st1.replace


















    }
}