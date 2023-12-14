package C12ClassLecture;

public class C1202Class { // public class는 하나여야한다.
    public static void main(String[] args) {
//        System.out.println(MyCalculator.sum(10, 20));
//
//
////        A부서의 매출
//        MyCalculator.sum_acc(10);
//        MyCalculator.sum_acc(20);
//        MyCalculator.sum_acc(30);
//        System.out.println(MyCalculator.total);
//
////        B부서의 매출
//        MyCalculator.sum_acc(20);
//        MyCalculator.sum_acc(30);
//        MyCalculator.sum_acc(40);
////        클래스 변수를 공용으로 사용하다보니, 변수와 메서드에 고유성이 보장되지 않음
//        System.out.println(MyCalculator.total);

//        A부서의 매출
        MyCalinstance myCalA = new MyCalinstance();
        myCalA.sum_acc(10);
        myCalA.sum_acc(20);
        myCalA.sum_acc(30);
        System.out.println(myCalA.total);

//        B부서의 매출
        MyCalinstance myCalB = new MyCalinstance();
        myCalB.sum_acc(10);
        myCalB.sum_acc(20);
        myCalB.sum_acc(30);
        System.out.println(myCalB.total);


    }
}


//내부 클래스
class MyCalinstance{
//    static이 붙어있는 변수는 클래스변수, static이 붙어있지 않으면 객체변수
    int total =0;
    //    매개변수 2개 받아서 더한 값 return : sum
    int sum(int a, int b) {
        return a + b;
    }
    void sum_acc(int total){
//        this객체 그 자신을 의미
        this.total +=total;
    }
}
