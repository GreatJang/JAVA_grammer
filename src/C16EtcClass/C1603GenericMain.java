package C16EtcClass;

import java.util.Arrays;

public class C1603GenericMain {
    public static void main(String[] args) {
        String[] stArr = {"java", "python", "C++"};
//        0번째와 1번째 자리 change
        Swap(stArr, 1, 2);
        System.out.println(Arrays.toString(stArr));

        Integer[] intArr = {1, 2, 3, 4, 5};
//        1번째 2번째 자리 change
        Swap(intArr, 1, 2);
        System.out.println(Arrays.toString(intArr));

        GenericStudent<String> gs1 = new GenericStudent<>();
        gs1.setAge("123");
        System.out.println(gs1.getAge().getClass()); // String 타입

        GenericStudent<Integer> gs2 = new GenericStudent<>();
        gs2.setAge(123);
        System.out.println(gs2.getAge().getClass()); // Integer 타입

    }

//
//    //    String[] 배열 change메서드 생성 : a번째 b번째
//    static void stSwap(String[] stArr, int a, int b) {
//        String stTemp = stArr[a];
//        stArr[a] = stArr[b];
//        stArr[b] = stTemp;
//    }
//
//    //    Integer[] 배열 change메서드 생성 : a번째 b번째
//    static void intSwap(Integer[] intArr, int a, int b) {
//        Integer intTemp = intArr[a];
//        intArr[a] = intArr[b];
//        intArr[b] = intTemp;
//    }
//    제네릭 메서드 생성 : 반환타입 왼쪽에 <T> 선언
//    제네릭은 객체 타입이 들어와야함에 유의
    static <T> void Swap(T[] arr, int a, int b) {
        T Temp = arr[a];
        arr[a] = arr[b];
        arr[b] = Temp;
    }
}

class GenericStudent <T> {
    String name;
    T age;

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }

}