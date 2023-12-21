import java.util.*;

public class test {
    public static void main(String[] args) {
//        문자열 my_string이 매개변수로 주어집니다. my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
        String my_string = "people"; //peol
        String answer = "";
        List<String> list = new ArrayList<>();
//        String[] ms = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            list.add(String.valueOf(my_string.charAt(i)));
        }
        for (int i = 0; i < list.length; i++) {
            for(int j=i+1; i < list.length; j++){
                if(list.get(list[j])){

                }
            }
        }

//        return answer;

    }
}

