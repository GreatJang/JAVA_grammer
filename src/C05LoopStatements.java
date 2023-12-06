import java.util.Scanner;

public class C05LoopStatements {
    public static void main(String[] args) {

//        while문 사용해서 2~10까지 출력
//        int n = 2;
//        while(n < 11) {
//            System.out.println(n);
//            n ++;
//        }

//    while(true) { // while문으로 감싸면 무한으로 구구단 출력 가능
//        Scanner sc = new Scanner(System.in);
//        System.out.println("구구단 단수를 입력해주세요");
//        int input = sc.nextInt();
//        int n = 1;
//        while (n < 10) {
//            System.out.println(input + " X " + n + " = " + input * n);
//            n++;
//        }
//    }
//        System.out.println(input + " X " + 1 + " = " + input*1);
//        System.out.println(input + " X " + 2 + " = " + input*2);
//        System.out.println(input + " X " + 3 + " = " + input*3);
//        System.out.println(input + " X " + 4 + " = " + input*4);
//        System.out.println(input + " X " + 5 + " = " + input*5);
//        System.out.println(input + " X " + 6 + " = " + input*6);
//        System.out.println(input + " X " + 7 + " = " + input*7);
//        System.out.println(input + " X " + 8 + " = " + input*8);
//        System.out.println(input + " X " + 9 + " = " + input*9);

////        도어락키 if문 예제 : 비밀번호를 맞추면 반복이 종료되고, 그렇지 않으면 계속적으로 다시 질문
////        최대 5번까지만 비밀번호 입력가능하도록 => 입력횟수를 초과했습니다 라는 문구
//        int a = 0;
//        while(true) {
//            String pw = "0234";
//            System.out.println("비밀번호를 입력해주세요.");
//            Scanner Scan1 = new Scanner(System.in);
//            String input1 = Scan1.nextLine();
//            if (pw.equals(input1)) {
//                System.out.println("문이 열렸습니다.");
//                break;
//            } else{
//                System.out.println("비밀번호가 틀렸습니다.");
//            }
//            a++;
//            if(a==5) {
//                System.out.println("입력횟수를 초과했습니다.");
//                break;
//            }
//        }

////        do while문 사용해서 2~10까지 출력
//        int n = 2;
//        do {
//            n ++;
//            System.out.println(n);
//        } while(n < 11);

////        for문을 통해 2~10까지 출력
//        for(int a = 2; a < 11; a++){
//            System.out.println(a);
//        }

//        for, continue를 사용해서 홀수만 출력되도록(1~10까지 수 중에)
        for(int a = 1; a < 11; a++){
            if(a%2 == 0){
                continue; //continue를 만나면 위로 올라가서 if문 다시실행
            }
            System.out.println(a);
        }




    }
}
