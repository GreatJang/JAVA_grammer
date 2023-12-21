package C15AnonymousLambda;

import java.util.Arrays;

public class C1505StreamAPI1 {
    public static void main(String[] args) {

        int[] arr = {20,10,4,12};
////        전통적인 방식의 데이터 접근방식
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }

//        스트림의 생성 : arr
//        스트림의 중개연산 : map, sorted, filter
//        스티림의 최종 연산(스트림의 소모) : foreach, reduce

//        데이터와 객체 증심이 아닌, ⭐입력에 따른 출력만이 존재하는 함수형 프로그래밍 방식⭐
//        java에서 함수형프로그래밍을 지원하기위한 라이브러리 -> StreamAPI

//        Stream 원본에 영향 없음.
//        일종의 복사본이 만들어짐 Stream API를 사용할 수 있는 Stream객체를 생성한것. // Stream객체에 대한 Method를 배우는 것.
//        forEach : 스트림의 각 요소를 소모하면서 동작을 수행. // forEach 자체가 Enhanced for문과 동작이 비슷
        Arrays.stream(arr).forEach(a -> System.out.println(a));

//        arrStream객체가 정렬까지 된 상태에서 각 요소를 소모하면서 입력값을 기준으로 출력하겠다.
        Arrays.stream(arr).sorted().forEach(a -> System.out.println(a));

    }
}
