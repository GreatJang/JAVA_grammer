package C12ClassLecture;

import java.util.*;

public class C1205MethodOverloading {
    public static void main(String[] args) {
        C1205MethodOverloading mto = new C1205MethodOverloading();
//        메서드 오버로딩을 통해 같은 메서드명 재활용
//        제네릭을 통해 타입 재활용
        System.out.println(mto.sum(10, 20));
        System.out.println(mto.sum(10,20,30));
        System.out.println(mto.sum(10.5,20.5));
//        제네릭을 통해 타입 재활용 // <어떤 타입이 들어와도 가능>
        List<Integer> myList = new ArrayList<>();
    }
    public int sum(int a, int b){
        return a+b;
    }
    public int sum(int a, int b, int c){
        return a+b+c;
    }
    public double sum(double a, double b){
        return a+b;
    }
//    int 2개를 매개변수로 받아서 더한 값 return 메서드 : sum, static X
//    int 3개를 매개변수로 받아서 더한 값 return 매서드 : sum, static X
//    double 2개를 매개변수로 받아서 더한값 return 메서드 : sum, static X
}
