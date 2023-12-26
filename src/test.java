import java.util.*;

public class test {
    public static void main(String[] args) {

        int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int n = 3;
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int a = 0; a < num_list.length; a++) {
                for (int j = 0; j < n; j++) {
                    answer[i][j] = num_list[a];
                }
            }
        }

        System.out.println(Arrays.deepToString(answer));
//            return answer;


    }
}

