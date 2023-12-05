public class C03Operator {
    public static void main(String[] args) {
////        산술연산자
//        int num1=8, num2=3;
////        *, /나눗셈, &나머지
//        System.out.println("num1 + num2 = " + (num1 + num2));
//        System.out.println("num1 * num2 = " + (num1 * num2));
////        몫만 구하면 int로, 소수점 자리까지 구하려면 double
//        System.out.println("num1 / num2 = " + (num1 / (double)num2));
//        System.out.println("num1 & num2 = " + (num1 & num2));
//
////        대입연산자
//        int n1=7, n2=7, n3=7;
//        n1 = n1-3; // 4
//        n2 -= 3; // 4
//        n3 = -3; // -3
//
////        /=, %=
//        int n4 = 10; int n5 = 10;
//        n4 /= 3;
//        n5 %= 3;
//        System.out.println("n4 = " + n4 + " n5 = " + n5);
//
////        증감연산자
////        ++는 헷갈리니까 따로빼서 쓰자!
//        int a = 5;
//        int b = a++; //후위연산자 : 실행문이 끝나고 증감
//        System.out.println(a); //6
//        System.out.println(b); //5
//
//        a=5;
//        b=++a; //전위연산자 : 실행문이 끝나기전에 증감
//        System.out.println(a);
//        System.out.println(b);
//
//
//        int[] arr = {10,20,30};
//        a=0;
//        while(true) {
//            System.out.println(arr[a]);
//            a++;
//        }

//        비교연산자 : ==, !=, >, >= ...
//        char char1 = 'a';
//        char char2 = 'A';
////        boolean 타입
//        System.out.println(char1 == char2); //flase
//        System.out.println(char1 != char2); //true

//        논리연산자 : &&, ||, !
        int num1 = 10; int num2=20;
        boolean result1, result2;
//        result1에 num1이 5보다 큰지 조건과 num1 20보다 작은지 조건을 and 조건을 통해 boolean값 담기
        result1 = (num1 > 5) && (num1 < 20);
        System.out.println(result1);
//        result2에 num2가 10보다 작은 조건과 num2가 30보다 작은 조건을 or조건을 통해 boolean값 담기
        result2 = (num2 < 10) || (num2 < 30);
        System.out.println(result2);
//        result1, result2 각각 출력
//        result2에 !달아서 출력
        System.out.println(!result2);

//        비트연산자 : &, 각자리의수가 모두 1일경우에만 1
        System.out.println(2 & 1);
        System.out.println(2>0 & 3>0);
        int n1 = 10; int n2 = 20;
        if(n1>20 && n2<30){
            System.out.println("조건은 참입니다.");
        }



    }
}
