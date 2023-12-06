import java.util.Scanner;

public class C05LoopStatements {
    public static void main(String[] args) {

//        while문 사용해서 2~10까지 출력
//        int n = 2;
//        while(n < 11) {
//            System.out.println(n);
//            n ++;
//        }
    while(true) { // while문으로 감싸면 무한으로 구구단 출력 가능
        Scanner sc = new Scanner(System.in);
        System.out.println("구구단 단수를 입력해주세요");
        int input = sc.nextInt();
        int n = 1;
        while (n < 10) {
            System.out.println(input + " X " + n + " = " + input * n);
            n++;
        }
    }
//        System.out.println(input + " X " + 1 + " = " + input*1);
//        System.out.println(input + " X " + 2 + " = " + input*2);
//        System.out.println(input + " X " + 3 + " = " + input*3);
//        System.out.println(input + " X " + 4 + " = " + input*4);
//        System.out.println(input + " X " + 5 + " = " + input*5);
//        System.out.println(input + " X " + 6 + " = " + input*6);
//        System.out.println(input + " X " + 7 + " = " + input*7);
//        System.out.println(input + " X " + 8 + " = " + input*8);
//        System.out.println(input + " X " + 9 + " = " + input*9);







    }
}
