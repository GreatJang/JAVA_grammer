import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Stream;

public class test2 {
    public static void main(String[] args) {

        String my_string = "hi12392";
//
        String answer = my_string.replaceAll("[^0-9]","");
//        int[] a = new int[answer.length()];
        int[] digits = Stream.of(answer.split("")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(digits);
        System.out.println(Arrays.toString(digits));



    }
}
