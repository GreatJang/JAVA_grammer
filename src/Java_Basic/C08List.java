package Java_Basic;//import java.util.ArrayList; // 자바 util패키지 안에 ArrayList패키지를 쓸거야.
//import java.util.Arrays;
//import java.util.List;
import java.util.*; // 자바 util패키지 안에 모든 패키지 사용할거야.
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class C08List {
    public static void main(String[] args) {

////        list선언방법
////        ArrayList<String> myList = new ArrayList<>(String);
////        ArrayList<String> myList = new ArrayList<>();
////        가장 일반적인 방식
////        왼쪽엔 인터페이스, 오른쪽엔 구현체
//        List<String> myList = new ArrayList<>();
//
////        초기값 생성방법 1.하나씩 add
//        myList.add("java");
//        myList.add("python");
//        myList.add("c++");
//        System.out.println(myList);
//
////        초기값 생성방법 2.한꺼번에 add(배열을 이용한 변환)
//        String[] myArr1 = {"java", "python", "c++"};
//        List<String> myList2 = new ArrayList<>(Arrays.asList(myArr1));

////        ⭐Arrays.asList : 배열을 리스트로 변환
////        배열이 int인 경우 -> 형변환 이슈 발생 (문자열과 다르게 한꺼번에 형변환 하는게 문제가 된다)
//        int[] myIntArr1 = {1,2,3};
////        List<Integer> myIntList1 = new ArrayList<>(Arrays.asList(myIntArr1));
//
////        for문으로 배열에 넣을 시 오토박싱으로 변환해줌 // 배열이 int인 경우 List로 변경 시 제일 편한 방법.
//        List<Integer> myIntList1 = new ArrayList<>();
//        for(int a : myIntArr1){
//            myIntList1.add(a);
//        }

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
////        ⭐add(int index, int element) : 중간에 값 삽입은 기본적으로 성능저하
//        myList.add(1, 15);
//        System.out.println(myList);
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(30);
//        myList2.add(40);
//        myList2.add(50);
//
////        addAll(Collection객체) : 특정 리스트의 요소를 모두 add
//        myList.addAll(myList2);
//        System.out.println(myList);
//
////        get(int index) : 특정 위치의 요소를 반환
//        System.out.println(myList.get(0));
//
////        for문을 돌려 전체 출력.
////        ⭐size() : 리스트의 개수 반한
//        for(int i=0; i<myList.size(); i++){
//            System.out.println(myList.get(i));
//        }
//
////        remove : 요소삭제
////        remove는 value삭제, index를 통한 삭제
//
////        remove를 통한 index삭제 : 0번째
//        myList.remove(0);
//        System.out.println(myList);
//
////        객체를 통한 삭제 : Integer.valueOf
//        myList.remove(Integer.valueOf(15));
//        System.out.println(myList);
//
////        set(int index, E element) : index자리에 값 변경, E element는 요소 string일수도 있고 int일수도 있고
////        마지막자리값 : 100으로 세팅 후 출력
//        myList.set(myList.size()-1,100);
//        System.out.println(myList);
//
////        contains(E element) : 특정값이 있는지 없는지 boolean return
//        System.out.println(myList.contains(30));

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//
////        ⭐indexOf : 몇번째 index에 위치한지 return, 요소가 없으면 -1 return
////        같은 숫자가 있으면 첫번째 index값 returns
//        System.out.println(myList.indexOf(20));
//
////        전체삭제 : clear()
////        ⭐isEmpty : 값이 비었는지, 안비었는지
//        System.out.println(myList.isEmpty());
//        myList.clear();
//        System.out.println(myList.isEmpty());
//        System.out.println(myList);

////        ⭐리스트 출력 ⭐자주 사용되는 형식
//        ⭐List<int[]> myList = new ArrayList<>();
//        myList.add(new int[]{1,2,3});⭐ 값 세팅 시 new int[] 후 세팅해야함
//        myList.add(new int[2]);
//        myList.add(new int[3]);
//        myList.get(1)[0] = 10;
//        myList.get(1)[1] = 20;
//        for(int[] a : myList){ // ⭐Enhanced for문
//            System.out.println(Arrays.toString(a));
//        }
//        for(int i=0; i<myList.size(); i++){ // ⭐일반 for문
//            int[] a = myList.get(i);
//            System.out.println(Arrays.toString(a));
//        }

//        ⭐List<List<Integer>>  myList2 = new ArrayList<>(); //리스트 안에 리스트
//        myList2.add(new ArrayList<>(Arrays.asList(1,2,3)));
//        myList2.add(new ArrayList<>(Arrays.asList(10,20,30)));
//        myList2.add(new ArrayList<>(Arrays.asList(100,200,300)));
//        System.out.println(myList2);

//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[3]);
//        myList.add(new int[3]);
//        myList.add(new int[3]);
//
////        ⭐위 list에 값 1,2,3 10,20,30 100,200,300
//        int value = 1;
//        for(int i=0; i<myList.size(); i++){
//            for(int j=0; j<myList.get(i).length; j++){
//                myList.get(i)[j] = (j+1)*value;
//            }
//            value *=10;
//        }
//        for(int[] a : myList) { // Enhanced for문
//            System.out.println(Arrays.toString(a));
//        }

//        List<Integer> myList = new ArrayList<>(Arrays.asList(5,3,2,1,5));
////        리스트정렬1 : Collections.sort()
//        Collections.sort(myList); // 오름차순
//        System.out.println(myList);
//        Collections.sort(myList, Comparator.reverseOrder()); // 내림차순 // ⭐굉장히 많이 사용
//        System.out.println(myList);
////        리스트정렬2 : 객체.sort()
//        myList.sort(Comparator.naturalOrder());
//        System.out.println(myList);
//        myList.sort(Comparator.reverseOrder());
//        System.out.println(myList);

////        1. String배열을 list로 변환
//        String[] stArr = {"java", "spring", "django"};
////        1-1. ⭐Arrays.asList
//        List<String> stList1 = new ArrayList<>(Arrays.asList(stArr));
//        System.out.println(stList1);
//
////        1-2. ⭐for문담기
//        List<String> stList2 = new ArrayList<>();
//        for(String a : stArr){
//            stList2.add(a);
//        }
//
////        1-3.stramApi : 참고용
//        List<String> stList3 = Arrays.stream(stArr).collect(Collectors.toList());
//
////        2.int배열을 list로 변환
//        int[] intArr = {10,20,30,40};
////        1-1.Arrays.asList사용불가
////        1-2.for문 담기 사용가능⭐
////        1-3.streamAPI 사용가능 : 참고용
//        List<Integer> intList = Arrays.stream(intArr).boxed().collect(Collectors.toList());

////        3.String리스트를 String배열로 변환⭐
////        3-1)for문으로 할당
//        List<String> stList = new ArrayList<>(Arrays.asList("hello", "java", "world"));
//        String[] stArr = new String[stList.size()];
//        for(int i=0; i< stArr.length; i++){
//            stArr[i] = stList.get(i);
//        }
//        System.out.println(Arrays.toString(stArr));
//
////        3-2)streamAPI : 참고만
//        String[] stArr2 = stList.stream().toArray(a->new String[a]);

//        4.int리스트를 int매열로 변환
//        4-1)for문으로 변환
//        4-2)streamAPI로 변환

////        두개뽑아서 더하기 : 리스트로 풀기

//        int[] numbers = {2,1,3,4,1};
//        List<Integer> myList = new ArrayList<>();
//        for(int i=0; i<numbers.length-1; i++){
//            for(int j=i+1; j< numbers.length; j++){
//                if(!myList.contains(numbers[i]+numbers[j])){
//                    myList.add(numbers[i]+numbers[j]);
//                }
//            }
//        }
//        Collections.sort(myList);
//        int[] answer = new int[myList.size()];
//        for(int i=0; i<myList.size(); i++){
//            answer[i] = myList.get(i);
//        }
//        System.out.println(myList);

////        n의 배수 고르기 : x % n == 0 리스트로 풀기
//        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
//        int n = 3;
//        List<Integer> arr = new ArrayList<>();
//        for (int i = 0; i < numlist.length; i++) {
//            if (numlist[i]%n == 0){
//                arr.add(numlist[i]);
//            }
//        }
//        int[] answer = new int[arr.size()];
//        for(int i=0; i< arr.size(); i++){
//            answer[i] = arr.get(i);
//        }
//        System.out.println(Arrays.toString(answer));


    }
}
