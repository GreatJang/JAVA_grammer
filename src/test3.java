import C14Interface.Bank.Model.BankAccount;

import java.util.*;
class test3 {
    public static void main(String[] args) {
        int[] sequence = {1, 2, 3, 4, 5};
//        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4)); //1,2,3,4
        List<List<Integer>> permutation_list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>(); // temp의 주소
        boolean[] visited = new boolean[sequence.length];

        for (int n = 2; n <= sequence.length; n++) {
            permutation(n, temp, permutation_list, sequence, visited);
        }
        System.out.println(permutation_list);


//            int[] answer = {};
//            return answer;
    }
    static void permutation(int n, List<Integer> temp, List<List<Integer>> permutation_list, int[] sequence, boolean[] visited) {
        if (temp.size() == n) {
            int total = 0;
            int k = 7;
            for (int a : temp) { //⭐
                total += a;
            }
            if (total > 0) {
                permutation_list.add(new ArrayList<>(temp));
            }
            return;
        }
        for (int i = 0; i < sequence.length; i++) { // int i 값을 0으로 두면 변화하지 않기 때문에 값이 전체가 다 나온다.
            if (visited[i] == false) { // i번째 visited가 false 일때 temp add 로직 추가
                visited[i] = true; // i번째 visited를 true로 변경
                temp.add(sequence[i]); // temp 배열에 add
                permutation(n, temp, permutation_list, sequence, visited); // 메서드 호출이기때문에 변수명으로 넣어야 한다.
                temp.remove(temp.size() - 1); // 백트랙킹// index 1번째 요소값 삭제
                visited[i] = false; // i번째 visited를 false로 변경
            }
        }
    }
}
