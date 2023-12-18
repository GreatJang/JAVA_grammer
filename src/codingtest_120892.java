import java.lang.reflect.Array;
import java.util.ArrayList;

public class codingtest_120892 {
    public static void main(String[] args) {

        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        int k = code -1;
        String answer = "";
        char[] arr = cipher.toCharArray();
        for(int i=0; i<arr.length; i++){
            for(int j=1; j< arr.length/2; j++){
                if(arr[i]==arr[k*j]){
                    answer += i;

                }
            }
        }
        System.out.println(answer);




    }
}
