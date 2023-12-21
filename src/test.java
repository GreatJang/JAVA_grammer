import java.util.*;

public class test {
    public static void main(String[] args) {
//        문자열 my_string이 매개변수로 주어집니다. my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
        String my_string = "people"; //peol
//                List<String> list = new ArrayList<>();
//        StringBuilder sb = new StringBuilder();
        String[] a = my_string.split(""); // split으로 문자열을 하나하나 분리해서 String 배열로 return // split : 리턴값은 String 배열
        Set<String> a2 = new LinkedHashSet<>(Arrays.asList(a)); // 분리된 String배열을 리스트로 변환 후 set으로 받아서 중복값을 제거한다.
//        HashSet은 중복제거하지만 순서를 관리하지 않아 값을 출력할 때 마다 다른 순서대로 출력이된다.
//        LinkedHashSet은 중복도 제거하고 삽입된 순서대로 값을 유지한다.
        String answer = String.join("",a2); // String.join을 사용해서 set을 문자열로 반환.
        System.out.println(answer); // set을 문자열로 반환 후 출력

//        Integer.valueOf("10");
//        String.valueOf('c');

//        Set<String> a2 = new LinkedHashSet<>(Arrays.asList(a));
//        String answer = String.join("",a2);
//        System.out.println(answer);







//        List<String> list = new ArrayList<>();
////        String[] ms = new String[my_string.length()];
//        for (int i = 0; i < my_string.length(); i++) {
//            list.add(String.valueOf(my_string.charAt(i)));
//        }
//        if(list.size() ==1){
//            String answer = String.join("", list);
//            System.out.println(answer);
//        }
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = i + 1; j < list.size(); j++) {
//                if (list.get(i).equals(list.get(j))) {
//                    list.remove(j);
//                }
//            }
//        }
//        String answer = String.join("", list);
//        System.out.println(answer);
////        return answer;

    }
}

