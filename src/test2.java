import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Stream;

public class test2 {
    public static void main(String[] args) {
        int order = 29423;
        int answer = 0;
        List<Integer> intList = new ArrayList<>();
        while(order>0){
            intList.add(order%10);
            order/=10;
        }
        Collections.reverse(intList);
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) == 3 || intList.get(i) == 6 || intList.get(i) == 9) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}