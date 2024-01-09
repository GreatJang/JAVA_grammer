import java.util.Arrays;

public class testtest {
    public static void main(String[] args) {
        String my_string = "banana";
        String is_suffix = "ana"; //"nan" // "abanana"
        String a = my_string.substring(my_string.length()-is_suffix.length(), my_string.length());
        if(a.equals(is_suffix)){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
//        if(my_string.contains(is_suffix) && my_string.charAt(my_string.length()) == )
//            int answer = 0;
//            return answer;
    }
}
