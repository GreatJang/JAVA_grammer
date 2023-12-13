import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class C10Set {
    public static void main(String[] args) {

////        중복없고, 순서없다.
////        리스트, 배열의 중복을 없앨 때 set 사용하면 중복을 없앨 수 있음
////        set으로 중복 없애고 다시 리스트나 배열로 반환하면 중복 제거됌.
//        Set<String> mySet = new HashSet<>();
//        mySet.add("h");
//        mySet.add("h");
//        mySet.add("e");
//        mySet.add("l");
//        mySet.add("l");
//        mySet.add("o");
//        System.out.println(mySet);

//        좋아하는 종목명의 개수를 출력
        List<String> myList = new ArrayList<>();
        myList.add("basketball");
        myList.add("basketball");
        myList.add("basketball");
        myList.add("baseball");
        myList.add("baseball");
        myList.add("tennis");
        myList.add("tennis");
        myList.add("tennis");

//        Set<String> mySet = new HashSet<>();
//        for (int i = 0; i < myList.size(); i++) {
//            String temp = myList.get(i);
//            mySet.add(temp);
//        }
//        System.out.println(mySet.size());

////        아래와 같이 Set 선언 시 List를 인자값으로 받아서 초기값 세팅가능⭐
//        Set<String> mySet = new HashSet<>(myList);
//        System.out.println(mySet.size());

////        배열을 인자값으로 받아 set 초기값 세팅⭐ = Arrays.asList(myArr)
//        String[] myArr = {"hello", "java", "java", "world", "world"};
//        Set<String> mySet = new HashSet<>(Arrays.asList(myArr));
////        Set<String> mySet2 = new HashSet<>(mySet); // set 세팅도 가능 참고만 하기
//        mySet.remove("java");
//        System.out.println(mySet);
//
////        int 배열 : 형변환 이슈로 for문으로 새로 담아주어야함.
//        int[] myArrInt = {1,2,3,4,4,3,2};
//        Set<Integer> mySetInt = new HashSet<>();
//        for(int a : myArrInt){
//            mySetInt.add(a);
//        }
//        System.out.println(mySetInt);
//
////        Integer 배열 : 인자값으로 받아 set 초기값 세팅 가능
//        Integer[] myArrInt2 = {1,2,3,4,4,3,2};
//        Set<Integer> mySetInt2 = new HashSet<>(Arrays.asList(myArrInt2));
//           System.out.println(mySetInt2);

        Set<String> mySet1 = new HashSet<>(Arrays.asList("java", "python", "javascript"));
        Set<String> mySet2 = new HashSet<>(Arrays.asList("java", "html", "css"));


//        교집합 : retainAll
        Set<String> temp1 = new HashSet<>(mySet1);
        temp1.retainAll(mySet2);
        System.out.println(temp1);

//        합집합 : addAll
        Set<String> temp2 = new HashSet<>(mySet1);
        temp2.addAll(mySet2);
        System.out.println(temp2);

//        차집합 : removeAll
        Set<String> temp3 = new HashSet<>(mySet1);
        temp3.removeAll(mySet2);
        System.out.println(temp3);

//        프로그래머스 전화번호 목록
//        배열 전체를 set으로 만들어 놓고 각 값들을 contains로 확인 후 뽑아오기

//        순서가 없으므로 enhanced for문, iterator 사용

//        LinkedHashSet, TreeSet
        Set<String> mySet = new TreeSet<>();
        mySet.add("hello5");
        mySet.add("hello4");
        mySet.add("hello3");
        mySet.add("hello2");
        mySet.add("hello1");
        System.out.println(mySet);

//        두 개 뽑아서 더하기 : tree set 사용
        int[] numbers = {2,1,3,4,1};
        Set<Integer> myTreeSet = new TreeSet<>();
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j< numbers.length; j++){
                myTreeSet.add(numbers[i] + numbers[j]); //담는 순간부터 다 넣을 때까지 정렬 계속.
            }
        }
        int[] answer = new int[myTreeSet.size()];
        int count =0;
        for(int a : myTreeSet){
            answer[count] =a;
            count++;
        }
        Arrays.sort(answer);
        System.out.println(myTreeSet);

    }
}
