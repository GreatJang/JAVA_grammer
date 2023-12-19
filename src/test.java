import java.util.*;

public class test {
    static int answer=0;
    static int count=0;
    public static void main(String[] args) {
        boolean[] visited = new boolean[dungeons.length()];
        permutation(k, dungeons, visited);

    }
    //    3개 순열에서 합계가 가장 큰값(합 값만) : max 찾기 알고리즘(static활용)
    static void permutation(int k, int[][] dungeons, boolean[] visited){
            if(count > answer){
                answer = count;
            }
            if(count == dungeons.length) {
                return;
            }
        for (int i = 0 ; i < dungeons.length; i++) {
            if(!visited[i] && count + dungeons[i][0] <= k){
                visited[i] = true;
                count += dungeons[i][1];
                permutation(k, dungeons, visited);
                count -= dungeons[i][1];
                visited[i] = false;
            }
        }
    }
}

