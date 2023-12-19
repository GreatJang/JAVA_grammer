import java.util.*;

public class test {
    static int answer; // static // 전역적으로 관리
    static int k=80;
    static int count;
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4)); //1,2,3,4
        List<List<Integer>> combination_list = new ArrayList<>();
        List<List<Integer>> permutation_list = new ArrayList<>();
        int[][] dungeons = {{80,20}, {50,40},{30,10}};
        List<Integer> temp = new ArrayList<>(); // temp의 주소
        boolean[] visited = new boolean[myList.size()];
//        combination(2, 0, temp, combination_list, myList);
        permutation(0, 0, dungeons, permutation_list, myList, visited);

    }
    //    3개 순열에서 합계가 가장 큰값(합 값만) : max 찾기 알고리즘(static활용)
    static void permutation(int temp, int count, int[][] dungeons, List<List<Integer>> permutation_list, List<Integer> myList, boolean[] visited){
            if(count > answer){
                answer = count;
            }
            if(count == dungeons.length) {
                return;
            }
        for (int i = 0 ; i < myList.size(); i++) {
            if(visited[i] == false && temp + dungeons[i][0] <= k){
                visited[i] = true;
                temp += dungeons[i][1];
                permutation(temp, count+1, dungeons,permutation_list, myList, visited);
                temp -= myList.get(i);
                visited[i] = false;
            }
        }
    }
}

