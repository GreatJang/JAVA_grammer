import java.util.*;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        int num = 29183;
        int k =0;
        int answer = 0;

        List<Integer> intList = new ArrayList<>();
        while(num>0){
            intList.add(num%10);
            num/=10;
        }
        Collections.reverse(intList);
        if(intList.indexOf(k)>0){
            System.out.println(intList.indexOf(k));
        }else{
            System.out.println(-1);
        }
    }
}