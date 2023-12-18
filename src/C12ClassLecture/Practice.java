package C12ClassLecture;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<List<Integer>> combination_list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>(); //temp의 주소
        combination(2, 0, temp, combination_list, myList);
        System.out.println(combination_list);

//        for(int i=0; i<myList.size()-1; i++){
//            temp.add(myList.get(i));
//            for(int j=i+1; j<myList.size(); j++){
//                temp.add(myList.get(j));
//                combination_list.add(new ArrayList<>(temp)); //1,2  1,3
////                새로운 배열을 만들어서 temp add 시 주소값이 아니라 값만 들어감
//                temp.remove(temp.size()-1); //1,2,3 == 바깥 for문에서 index0을 지우지 않으면 1,2,3이 되어버린다.
////                temp 주소값으로 가서 remove를 하기 때문에 값이 다 사라짐 그래서 add할 때 그냥 temp가 아니라 new ArrayList로 temp add
//            }
//            temp.remove(temp.size()-1);
//        }
//        System.out.println(combination_list);
    }
    static void combination(int n, int start, List<Integer> temp, List<List<Integer>> combination_list, List<Integer> myList){
        if (temp.size() == n) { // 종료조건 temp.size가 2일 때 combination_list에 add하고 종료
                combination_list.add(new ArrayList<>(temp)); //1,2  1,3 1,4
                return;
        }
        for (int i = start; i < myList.size(); i++) {// int i값을 0으로 두면 변화하지 않기 때문에 값이 전체가 다 나온다.
//            그렇기 때문에 int i 값을 start 변수로 두고 combination에 start값을 i+1로 해주어야 중복이 되지 않고 1,2 1,3 1,4 2,3 2,4 3,4 이렇게 나온다.
                temp.add(myList.get(i));
            System.out.println(temp);
                combination(n, i+1, temp, combination_list, myList);
                temp.remove(temp.size() - 1);
        }
    }
}