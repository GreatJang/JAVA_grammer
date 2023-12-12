//import java.util.ArrayList; // 자바 util패키지 안에 ArrayList패키지를 쓸거야.
//import java.util.Arrays;
//import java.util.List;
import java.util.*; // 자바 util패키지 안에 모든 패키지 사용할거야.

public class C08List {
    public static void main(String[] args) {

//        list선언방법
//        ArrayList<String> myList = new ArrayList<>(String);
//        ArrayList<String> myList = new ArrayList<>();
//        가장 일반적인 방식
//        왼쪽엔 인터페이스, 오른쪽엔 구현체
        List<String> myList = new ArrayList<>();

//        초기값 생성방법 1.하나씩 add
        myList.add("java");
        myList.add("python");
        myList.add("c++");
        System.out.println(myList);

//        초기값 생성방법 2.한꺼번에 add(배열을 이용한 변환)
        String[] myArr1 = {"java", "python", "c++"};
        List<String> myList2 = new ArrayList<>(Arrays.asList(myArr1));
//        Arrays.asList : 배열을 리스트로 변환
//        배열이 int인 경우 -> 형변환 이슈 발생 (문자열과 다르게 한꺼번에 형변환 하는게 문제가 된다)
        int[] myIntArr1 = {1,2,3};
//        List<Integer> myIntList1 = new ArrayList<>(Arrays.asList(myIntArr1));

//        for문으로 배열에 넣을 시 오토박싱으로 변환해줌 // 배열이 int인 경우 List로 변경 시 제일 편한 방법.
        List<Integer> myIntList1 = new ArrayList<>();
        for(int a : myIntArr1){
            myIntList1.add(a);
        }













    }
}
