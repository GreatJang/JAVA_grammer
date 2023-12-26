import java.util.*;

public class test {
    public static void main(String[] args) {

        int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int n = 3;
        int a = 0;
        int[][] answer = new int[num_list.length/n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[a];
                a++;
            }
        }

        System.out.println(Arrays.deepToString(answer));
//            return answer;


    }
}

