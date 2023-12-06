import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
import java.util.SplittableRandom;

public class C04IfStatements {
    public static void main(String[] args) {

//        비밀번호 => 1234
//        스캐너를 써서 사용자의 input int로 받아서 만약에 비밀번호와 사용자의 input 일치하면 문이열렸습니다.
//        일치하지 않으면 비밀번호가 틀렸습니다 출력

//        도어락키 if문 예제
//        0234 -> 00234 = int로 받으면 비밀번호가 맞아버리기 때문에 String으로 받아야 한다.
//        String pw = "0234"; //String의 기능을 pw가 가지고 있는 의미(복사본의 의미)
//        System.out.println("비밀번호를 입력해주세요.");
//        Scanner Scan1 = new Scanner(System.in);
//        String input1 = Scan1.nextLine();
//
//        if (pw.equals(input)){  //문자열 비교시 == 사용금지, .equals 사용.
//            System.out.println("문이열렸습니다.");
//        } else {
//            System.out.println("비밀번호가 틀렸습니다.");
//        }

//        묵시적 타입변환, 각 문자가 숫자를 가지고 있다.
//        a : 97, A : 65
//        사용자한테 알파벳을 아무거나 입력받고, 그 알파벳이 대문자인지 소문자인지 판별
//        Scanner Scan2 = new Scanner(System.in);
//        System.out.println("알파벳을 입력해주세요");
//        char input2 = Scan2.nextLine().charAt(0);
//
//        if (input >= 'a' && input <= 'z') {
//            System.out.println("소문자입니다.");
//        }else if (input > 'A' && input < 'Z') {
//            System.out.println("대문자입니다.");
//        }else {
//            System.out.println("알파벳이 아닙니다.");
//        }

////        버스카드 예제
////        내 돈이 얼마있는지를 입력
////        버스요금이 1500이다.
////        돈이 더 적으면 탑승불가, 돈이 더 많으면 정상처리 출력.
////        도난여부 boolean 설정(입력X)
//        int myMoney = 10000;
//        boolean isStolen = false;
//        System.out.println("도난카드입니까? 예/아니오로 대답하시오");
//        Scanner sc = new Scanner(System.in);
//        if(sc.nextLine().equals("예")){
//            isStolen = true;
//        }
//
//        if (myMoney < 1500 || isStolen == true) {
//            System.out.println("탑승불가입니다.");
//        } else {
//            System.out.println("정상 탑승되었습니다.");
//        }
//
//        if (myMoney >= 1500 && isStolen == false) {
//            System.out.println("정상 탑승되었습니다.");
//        } else {
//            System.out.println("탑승불가입니다.");
//        }

//        삼항연산자
//        도어락키 if문 예제
//        String pw = "0234";
//        System.out.println("비밀번호를 입력해주세요.");
//        Scanner Scan1 = new Scanner(System.in);
//        String input1 = Scan1.nextLine();
//        String result = pw.equals(input1) ? "문이 열렸습니다." : "비밀번호가 틀렸습니다."; //결과값 = 조건식 ? 반환값1 : 반환값2
//        System.out.println(result);
//        if (pw.equals(input1)){  //문자열 비교시 == 사용금지, .equals 사용.
//            System.out.println("문이열렸습니다.");
//        } else {
//            System.out.println("비밀번호가 틀렸습니다.");
//        }


////        myMoney = 10000
////        택시요금 : 10000원
////        버스요금 : 3000원
////        킥보드 : 2000원
////        걸어가기 : 0원
//
//        int myMoney = 10000;
//        int texyFee = 10000;
//        int busFee = 3000;
//        int KickBoardFee = 2000;
//
//        if(myMoney >= texyFee) { // if, else if는 서로 의존적
//            System.out.println("택시타시는걸 추천드립니다.");
//        }else if(myMoney >= busFee) {
//            System.out.println("버스타시는걸 추천드립니다.");
//        }else if(myMoney >= KickBoardFee) {
//            System.out.println("킥보드타시는걸 추천드립니다.");
//        }else {
//            System.out.println("걸어가세요.");
//        }
//
//        if(myMoney >= texyFee) { // if는 독립적이어서 범위를 정확히 명시해주어야 한다.
//            System.out.println("택시타시는걸 추천드립니다.");
//        }if(myMoney < texyFee && myMoney >= busFee) {
//            System.out.println("버스타시는걸 추천드립니다.");
//        }if(myMoney < busFee && myMoney >= KickBoardFee) {
//            System.out.println("킥보드타시는걸 추천드립니다.");
//        }if(myMoney < KickBoardFee) {
//            System.out.println("걸어가세요.");
//        }

//        Switch 고객센터 출력 예제
//        원하시는 번호를 입력해주세요
//        1. 대출서비스입니다., 2. 예금, 3. 적금
//        0.상담사 연결입니다., 그외 : 잘못누르셨습니다.
        System.out.println("원하시는 번호를 입력해주세요");
        Scanner Scan4 = new Scanner(System.in);
        int input4 = Scan4.nextInt();
        switch (input4) {
            case 1:
                System.out.println("대출서비스 입니다.");
                break;
            case 2:
                System.out.println("예금서비스");
                break;
            case 3:
                System.out.println("적금서비스");
                break;
            case 0:
                System.out.println("상담사 연결입니다.");
                break;
            default:
                System.out.println("잘못누르셨습니다.");
                break;
        }
    }
}