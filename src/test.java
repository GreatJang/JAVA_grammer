import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class test {
    public static void main(String[] args) {
        String before = "olleh";
        String after = "hello";
        StringBuilder aft = new StringBuilder(after);
        for (int i = 0; i < before.length(); i++) {
            String a = String.valueOf(before.charAt(i));

//            System.out.println(aft.indexOf(a));
            if(aft.indexOf(a) == -1){
                System.out.println(0);
                break;
            }
            if(aft.indexOf(a)==0){
                System.out.println(1);
            }
            aft.deleteCharAt(aft.indexOf(a));
//            System.out.println(aft.indexOf(a));
//            if (aft.(a)) {
//                aft.deleteCharAt(after.indexOf(a));
//                System.out.println(aft);

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

//    }
}