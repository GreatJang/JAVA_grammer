import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Stream;

public class test2 {
    static int answer;
    static int temp=0;
    public static void main(String[] args) {
        recur(3, 2, 0);
        System.out.println(answer);

    }

    static void recur(int balls, int share, int start){
        if(temp == share){
            answer ++;
        }
        for(int i = start; i< balls; i++){
            temp ++;
            System.out.println(temp);
            recur(balls, share, i+1);
            temp --;
        }
    }
}