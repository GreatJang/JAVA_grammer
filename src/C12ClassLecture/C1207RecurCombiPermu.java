package C12ClassLecture;

import java.util.*;

public class C1207RecurCombiPermu {
    static int answer; // static // 전역적으로 관리
    static int count;
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4)); //1,2,3,4
        List<List<Integer>> combination_list = new ArrayList<>();
        List<List<Integer>> permutation_list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>(); // temp의 주소
        boolean[] visited = new boolean[myList.size()];
//        combination(2, 0, temp, combination_list, myList);
        permutation(0, 0, permutation_list, myList, visited);

//        // 2번째
//        for(int n=2; n<= myList.size(); n++){
//            permutation(n, 0,0, permutation_list, myList, visited);
//        }

//        System.out.println(permutation_list);
        System.out.println(answer);
//        System.out.println(combination_list);


//        for (int i = 0; i < myList.size() - 1; i++) {
//            temp.add(myList.get(i));
//            for (int j = i + 1; j < myList.size(); j++) {
//                temp.add(myList.get(j));
//                combination_list.add(new ArrayList<>(temp)); //1,2   1,3   1,4
//                // 새로운 배열을 만들어서 temp add 시 주소값이 아니라 값만 들어감
//                temp.remove(temp.size() - 1); //1,2,3 == 바깥 for문에서 index 0을 지우지 않으면 1,2,3이 되버림
//                // temp 주소값으로 가서 remove를 하기때문에 값이 다 사라짐 그래서 add 할때 그냥 temp가 아니라 new ArrayList로 temp add
//            }
//            temp.remove(temp.size() - 1);
//        }
//        System.out.println(combination_list);
    }

    //    ⭐⭐
//    static void combination(int n, int start, List<Integer> temp, List<List<Integer>> combination_list, List<Integer> myList){
//        if (temp.size() == n) { // 종료조건 temp.size가 2일때 combination_list에 add하고 종료
//            combination_list.add(new ArrayList<>(temp)); //1,2   1,3   1,4
//            return;
//        }
//        for (int i = start ; i < myList.size(); i++) { // int i 값을 0으로 두면 변화하지 않기 때문에 값이 전체가 다 나온다.
////            그렇기 때문에 int i 값을 start변수로 두고 combination에 start값을 i+1로 해주어야 중복이 되지않고 1,2 1,3 1,4 2,3 2,4 3,4 이렇게 나온다.
//            temp.add(myList.get(i));
//            combination(n, i+1, temp, combination_list, myList); // 메서드 호출이기때문에 변수명으로 넣어야 한다.
//            temp.remove(temp.size() - 1);
//        }

//    순열 실습
//    static void permutation(int n, List<Integer> temp, List<List<Integer>> permutation_list, List<Integer> myList, boolean[] visited){
//        if(temp.size()==n){
//            permutation_list.add(new ArrayList<>(temp));
//            return;
//        }
//        for (int i = 0 ; i < myList.size(); i++) { // int i 값을 0으로 두면 변화하지 않기 때문에 값이 전체가 다 나온다.
//            if(visited[i] == false){ // i번째 visited가 false 일때 temp add 로직 추가
//                visited[i] = true; // i번째 visited를 true로 변경
//                temp.add(myList.get(i)); // temp 배열에 add
//                permutation(n, temp, permutation_list, myList, visited); // 메서드 호출이기때문에 변수명으로 넣어야 한다.
//
//                temp.remove(temp.size() - 1); // 백트랙킹// index 1번째 요소값 삭제
//                visited[i] = false; // i번째 visited를 false로 변경
//            }
//        }
//    }
//}

////    합계가 6이상인 2개 순열만 add
//    static void permutation(int n, List<Integer> temp, List<List<Integer>> permutation_list, List<Integer> myList, boolean[] visited){
//        if(temp.size()==n){
//            int total = 0;
//            for(int a : temp){ //⭐
//                total +=a;
//            }
//            if(total>=6){
//                permutation_list.add(new ArrayList<>(temp));
//            }
//            return;
//        }
//        for (int i = 0 ; i < myList.size(); i++) { // int i 값을 0으로 두면 변화하지 않기 때문에 값이 전체가 다 나온다.
//            if(visited[i] == false){ // i번째 visited가 false 일때 temp add 로직 추가
//                visited[i] = true; // i번째 visited를 true로 변경
//                temp.add(myList.get(i)); // temp 배열에 add
//                permutation(n, temp, permutation_list, myList, visited); // 메서드 호출이기때문에 변수명으로 넣어야 한다.
//
//                temp.remove(temp.size() - 1); // 백트랙킹// index 1번째 요소값 삭제
//                visited[i] = false; // i번째 visited를 false로 변경
//            }
//        }
//    }
//}

////    합계가 6이상인 모든 순열 add : temp.size 변화시키거나, 길이제한하기
//    static void permutation(int n, List<Integer> temp, List<List<Integer>> permutation_list, List<Integer> myList, boolean[] visited){
//        if(temp.size()==n){
//            int total = 0;
//            for(int a : temp){ //⭐
//                total +=a;
//            }
//            if(total>=6){
//                permutation_list.add(new ArrayList<>(temp));
//            }
//            return;
//        }
//        for (int i = 0 ; i < myList.size(); i++) { // int i 값을 0으로 두면 변화하지 않기 때문에 값이 전체가 다 나온다.
//            if(visited[i] == false){ // i번째 visited가 false 일때 temp add 로직 추가
//                visited[i] = true; // i번째 visited를 true로 변경
//                temp.add(myList.get(i)); // temp 배열에 add
//                permutation(n, temp, permutation_list, myList, visited); // 메서드 호출이기때문에 변수명으로 넣어야 한다.
//                temp.remove(temp.size() - 1); // 백트랙킹// index 1번째 요소값 삭제
//                visited[i] = false; // i번째 visited를 false로 변경
//            }
//        }
//    }
//}

//    3개 순열에서 합계가 가장 큰값(합 값만) : max 찾기 알고리즘(static활용)
//    => temp 리스트 쓰지말고 1)static활용, 2)매개변수로 n+1넘기기
    static void permutation(int temp, int count, List<List<Integer>> permutation_list, List<Integer> myList, boolean[] visited){
        if(count == 3){ // 순열이 몇번까지 파고 들어갔는지 count
            if(temp > answer){
                answer = temp;
            }
            return;
        }
        for (int i = 0 ; i < myList.size(); i++) { // int i 값을 0으로 두면 변화하지 않기 때문에 값이 전체가 다 나온다.
            if(visited[i] == false){ // i번째 visited가 false 일때 temp add 로직 추가
                visited[i] = true; // i번째 visited를 true로 변경
//                temp += myList.get(i); // temp 배열에 add
                permutation(temp + myList.get(i), count+1/*⭐*/, permutation_list, myList, visited); // 메서드 호출이기때문에 변수명으로 넣어야 한다.
//                temp -= myList.get(i); // 백 트랙킹// index 1번째 요소값 삭제
                // temp +-를 지우고 permutatiion temp에 temp + myList.get(i)을 넣으면 코드가 더 간단해진다.
                visited[i] = false; // i번째 visited를 false로 변경
            }
        }
    }
}

