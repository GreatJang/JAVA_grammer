import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class test {
    public static void main(String[] args) {
        String before = "oleeh";
        String after = "hello";
        StringBuilder aft = new StringBuilder(after);
        int answer;
        for (int i = 0; i < before.length(); i++) {
            String a = String.valueOf(before.charAt(i));
            if (after.contains(a)) {
                aft.deleteCharAt(Integer.parseInt(a));
                System.out.println(aft);

//                StringBuilder MyString = new StringBuilder("Hello World");
//                System.out.println("The string before removing character: " + MyString);
//                MyString = MyString.deleteCharAt(5);
//                System.out.println(after);
            }
        }
//        if (count == after.length()) {
//            answer = 1;
//        } else {
//            answer = 0;
//        }
//        System.out.println(answer);

    }
}