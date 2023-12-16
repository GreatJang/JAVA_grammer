import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Stream;

public class test2 {
    public static void main(String[] args) {

        int[] numbers = {1,2,3};
        String direction = "right";

        List<Integer> newList = new ArrayList<>();
        for(int a : numbers){
            newList.add(a);
        }
        if(direction.equals("right")){
            newList.add(0,newList.get(newList.size()-1));
            newList.remove(newList.size()-1);

        }

        else if(direction.equals("left")){
            newList.add(newList.size(), newList.get(0));
            newList.remove(0);
        }

        int[] answer = new int[newList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = newList.get(i);
        }
        System.out.println(Arrays.toString(answer));



    }
}
