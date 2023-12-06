import java.util.Arrays;
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

////        for, continue를 사용해서 홀수만 출력되도록(1~10까지 수 중에)
//        for(int a = 1; a < 11; a++){
//            if(a%2 == 0){
//                continue; //continue를 만나면 위로 올라가서 if문 다시실행
//            }
//            System.out.println(a);
//        }

////        배열과 enhance for문
//        int[] myArr = {1,5,7,9,10};
////        일반 for문
//        for(int i=0; i<5; i++){
//            System.out.println(myArr[i]);
//        }
//
////        enhance for문
//        for(int a : myArr){
//            System.out.println(a);
//        }

////        일반for문을 통해 myArr의 값에 10씩 더한 뒤에 출력.
//        for(int i = 0; i< myArr.length; i++){
//            myArr[i] += 10;
//        }
//        System.out.println(Arrays.toString(myArr));

//        enhanced for문을 통해 myArr의 값에 10씩 더한 뒤에 출력.
//        enhanced for문으로는 값 변경이 불가능 하다. 출력 시 값에 10씩 더해지지 않음.
//        배열의 조회 및 합계에 자주 사용
//        for(int a : myArr){
//            a += 10;
//        }
//        System.out.println(Arrays.toString(myArr));

////        배열의 합계에 사용시 간단하게 사용가능
//        int sum = 0;
//        for(int a : myArr){
//            sum += a;
//        }
//        System.out.println(sum);

////        자바 변수의 유효범위 : { }
//        int num = 10;
//        if(num > 1){
//            int abc = 20;
//            num = 20;
//        }
//        System.out.println(num); // if문 밖에서 선언된 변수값을 if안에서 접근하여 변경하는 것은 가능.
//        System.out.println(abc); // if문 안에서 정의된 변수는 밖에서 인지 불가

//        for(int n = 2; n < 10; n++){
//            System.out.println(n + "단입니다.");
//
//            for(int i = 1; i < 10; i++){
//                System.out.println(n + " X " + i + " = " + n*i);
//            }
//        }

//        2중 for문을 통해 배열접근
        int[][] arr = {{1,2,3,4}, {5,6,7,8}};

        for(int i = 0; i< arr.length; i++){
            for(int a = 0; a< arr[i].length; a++){
                System.out.println(arr[i][a]);
            }
        }



    }
}
