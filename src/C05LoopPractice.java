import java.util.Scanner;

public class C05LoopPractice {
    public static void main(String[] args) {
////        짝수의 합 계산하기
////        1~20까지 짝수의 합 출력
//        int result =0;
//        for(int a = 1; a <=20; a ++){
//            if(a%2 == 0){
//                result += a;
//            }
//        }
//        System.out.println(result);

////        숫자 뒤집기
//        int num = 1234;
//        int result = 0;
//        while(true){
//            int temp = num % 10;
//            result = result*10 + temp;
//            num /= 10;
//            if(num==0){
//                break;
//            }
//        }
//        System.out.println(result);

//        최대공약수 구하기
        int a = 24; int b = 36;
        int num = a > b ? b : a;
        int maxNum = 0;
        for(int i=1; i<=num; i++){
            if(a % i == 0 && b % i == 0){
                maxNum = i;
            }
        }
        System.out.println(maxNum);

        int minNum = a/maxNum * b/maxNum * maxNum;
        System.out.println(minNum);



//        int a = 24; int b = 36;
//        int answer =0;
//        for(int i = 1; i <=24; i++){
//            answer = a / i;
//            if(36 % answer == 0){
//                System.out.println(answer);
//            }
//
//        }




    }
}
