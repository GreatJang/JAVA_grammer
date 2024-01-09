//package C12ClassLecture;
//
//import java.util.*;
//
//public class Practice {
//    static int answer; // static // 전역적으로 관리
//    static int count;
//    public static void main(String[] args) {
//        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4)); //1,2,3,4
//        List<List<Integer>> combination_list = new ArrayList<>();
//        List<List<Integer>> permutation_list = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        boolean[] visited = new boolean[myList.size()];
//        permutation(2, temp, permutation_list, myList, visited);
//
//
//        System.out.println(permutation_list);
////    }
//
////    순열 실습
//    static void permutation(int n, List<Integer> temp, List<List<Integer>> permutation_list, List<Integer> myList, boolean[] visited){
//        if (temp.size() == n) {
//            permutation_list.add(new ArrayList<>(temp));
//            return;
//        }
//        for(int i=0; i< myList.size(); i++){
//            if(visited[i] == false){
//                visited[i] = true;
//                temp.add(myList.get(i));
//                permutation(n, temp, permutation_list, myList, visited);
//                temp.remove(temp.size() -1);
//                visited[i] = false;
//            }
//        }
//    }
//}