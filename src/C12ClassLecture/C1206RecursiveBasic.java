package C12ClassLecture;

import java.util.*;

public class C1206RecursiveBasic {
    public static void main(String[] args) {

//        for문을 이용해서 1-10까지 합계
        int total = 0;
        for (int i = 10; i >=1 ; i--) {
            total +=i;
        }
        System.out.println(total);
        System.out.println(add_acc(10));
        System.out.println(factorial(10));

////        fibonacci for문으로만(배열없이)
//        int first = 1;
//        int second = 1;
//        for(int i= 2; i<10; i++){
//            int third = first + second;
//            first = second;
//            second = third;
//        }

        int n =10;
        int[] arr = new int[n];
//        fibonacci for문으로만(배열활용)
//        메모이제이션(기억알고리즘 - DP)
//        단계마다 계산결과값이 필요할때 메모이제이션 활용
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <n ; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[n-1]);


//        List<Integer> list = new ArrayList<>();
//        list.add(0,1);
//        list.add(1,1);
//        for(int i=2; i<10; i++){
//            list.add(i,list.get(i-1)+list.get(i-2));
//        }
//        System.out.println(list);
//        System.out.println(list.get(list.size()-1));

//        fibonacci : 재귀함수
        System.out.println(fibonacci(10));

    }
    
//    시간 복잡도 2^n승 = 복잡도가 극악이다. 쓰면안되는 수준.
    static int fibonacci(int n){
        if(n<=2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
//    메서드가 자기자신을 호출하는 메서드를 재귀함수라고 하고, 이러한 호출방식을 재귀호출이라고 한다.
    static int add_acc(int n) {
        if(n==1){
            return 1;
        }
        return n+add_acc(n-1);
    }
//      10 + add_acc(9)
//        9 + add_acc(8) ...
//          2 + add_acc(1)
//              add_acc(1) = 1
//                   = 10+9+8+7+6+5+4+3+2+1

//      누적곱하기 값 : 팩토리얼
    static int factorial(int n) {
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }
//    = 10*9*8*7*6*5*4*3*2*1
}
