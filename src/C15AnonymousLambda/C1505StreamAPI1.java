package C15AnonymousLambda;

import java.util.Arrays;
import java.util.jar.Attributes;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;

public class C1505StreamAPI1 {
    public static void main(String[] args) {

//        int[] arr = {20,10,4,12};
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
//        Arrays.stream(arr).forEach(a -> System.out.println(a));

//        arrStream객체가 정렬까지 된 상태에서 각 요소를 소모하면서 입력값을 기준으로 출력하겠다.
//        Arrays.stream(arr).sorted().forEach(a -> System.out.println(a));

////        스트림의 생성
//        String[] stArr = {"HTML", "CSS", "JAVA", "PYTHON"};
////        stream<객체> : 제네릭타입(<>)으로 stream객체가 생성
//        Stream<String> stStream = Arrays.stream(stArr);
//        // int로 만들게 되면 IntStream 사용 // int stream활용해서 간단하게 원하는값 추출 가능
//        int[] intArr = {10, 20, 30, 40, 50};
//        IntStream intStream = Arrays.stream(intArr);
//        int[] intArr2 = intStream.filter(a -> a > 20).toArray(); //filter = 배열을 다 돌면서 조건에 맞는 값 추출

//        참조변수의 스트림변환의 경우 제네릭의 타입소거 문제 발생. ex) <String>
//        제네릭의 타입소거란 java버전의 호환성을 위해 제네릭 타입을 런타임시점에 제거하는 것을 의미
//        제네릭타입이 제거 되다보니 toArray로 배열로 변환하려고 할때 어떤 타입으로 변환하는지 알수가 없어서 에러
//        = String은 .toArray()시 에러 // 타입을 알려주어야한다. 타입 설정시 길이는 매개변수 a를 넣어줌 a요소가 넘어와서 길이를 맞춰주는 것으로 예상
//        String[] stArr2 = stStream.filter(a -> a.length()<=4).toArray(a -> new String[a]);
//        메소드 참조 방식으로 표현하는 것이 더 일반적
//        메소드 참조 방식 : 클래스::메서드 // new키워드는 클래스의 생성자를 호출하는 키워드(메소드) // 클래스 : String[]
//        String[] stArr2 = stStream.filter(a -> a.length() <= 4).toArray(String[]::new);
//        System.out.println(Arrays.toString(stArr2));

//        stream 중개연산 : ⭐filter, ⭐map, sorted, distinct

////        distinct : 중복제거 후 스트림반환
//        int[] intArr = {10,10,30,30,50};
////        중복제거 후 총합 반환
//        int answer = Arrays.stream(intArr).distinct().sum();
//
//        String[] stArr = {"java", "java", "python", "C++"};
////        중복제거 후 새로운 배열 생성
//        String[] stArr2 = Arrays.stream(stArr).distinct().toArray(String[]::new);
//        System.out.println(Arrays.toString(stArr2));
////        중복제거하고 길이가 3개 이하것으로 제한하고, 남은배열의 길이 총합.(sum)
////        mapToInt를 통해 IntStream으로 변환 // IntStream으로 변환도기 때문에 IntStream으로 받아줘야함
////        총합으로 결과 출력시 int로 받아줘야함
//        IntStream myStream1 = Arrays.stream(stArr).distinct().filter(a->a.length()<=3).mapToInt(a ->a.length());
//        int myStream2 = Arrays.stream(stArr).distinct().filter(a->a.length()<=3).mapToInt(a ->a.length()).sum();
//        System.out.println(myStream2);

////        sorted : 정렬된 스트림반환
//        int[] arr = {4,1,2,3,6,7};
////        내림차순 정렬된 숫자 신규 배열 반환
//        int[] new_arr = Arrays.stream(arr).sorted().toArray();
//        System.out.println(Arrays.toString(new_arr));
//
//        List<Integer> myList = new ArrayList<>(Arrays.asList(6,1,2,3,1,6));
////        collect(구체적인컬렉션객체명시)
//        List<Integer> myLis2 = myList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//
//        List<String> stList = new ArrayList<>(Arrays.asList("java", "python", "C++", "javascript"));
////        streamAPI를 사용해서 문자열의 길이 4개 이상인, 문자열의 길이를 기준으로 정렬(내림)까지 하여 신규 List생성
////        문자열의 길이를 기준은 람다사용해서 풀기
//        List<String> new_stList = stList.stream().filter(a -> a.length()>=4).sorted((o1,o2) -> o2.length()-o1.length()).collect(Collectors.toList());
//        System.out.println(new_stList);
//
//        int[] arr_plus10 = Arrays.stream(arr).map(a-> a+10).toArray();
//        System.out.println(Arrays.toString(arr_plus10));
//
////        arr에서 짝수만 골라서 해당 수의 제곱의 총합을 구하라. sum()
//        int answer = Arrays.stream(arr).filter(a -> a%2==0).map(a->a*a).sum();
//        System.out.println(answer);

////        스트림소모 : forEach, reduce
////        forEach
        int[] arr = {10, 20, 30, 40};
////        Arrays.stream(arr).forEach(a -> System.out.println(a));
//        Arrays.stream(arr).forEach(System.out::println);

//        reduce : 누적연산
//        초기값을 지정하지 않으면 Optional객체 return
//        ⭐Optional객체 : 값이 있을수도 있고, 없을수도 있다는 것을 명시한 타입(java8이후 추가)

        String st1 = null;
//        System.out.println(st1.length());
        Optional<String> myOptional = Optional.ofNullable("hello");
        if(myOptional.isPresent()){
            System.out.println(myOptional.get().length());
        }

        int result = Arrays.stream(arr).reduce(1, (a,b) -> a*b); // 초기값 지정 곱하기이기 때문에 1
        System.out.println(result);

        int result2 = Arrays.stream(arr).reduce(0,(a,b) -> a+b); // 초기값 지정 더하기이기 때문에 0
//        int result3 = Arrays.stream(arr).reduce((a,b) -> a+b).getAsInt(); // 이렇게도 가능하지만 위에 코드처럼 초기값을 확인하는게 더 좋은 코드다.
        System.out.println(result2);

        String[] stArr = {"hello", "java", "world"}; // "hello, java, world"로 출력하기 초기값 "" + 후 구분자, 넣기
        Optional<String> answer = Arrays.stream(stArr).reduce((a,b) -> a+", "+b);
        if(answer.isPresent()){ // 만약 answer에 값이 있으면
            System.out.println(answer.get()); // answer를 출력한다.
        }




    }
}
