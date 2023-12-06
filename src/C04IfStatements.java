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
        String pw = "0234";
        System.out.println("비밀번호를 입력해주세요.");
        Scanner Scan1 = new Scanner(System.in);
        String input1 = Scan1.nextLine();
        String result = pw.equals(input1) ? "문이 열렸습니다." : "비밀번호가 틀렸습니다."; //결과값 = 조건식 ? 반환값1 : 반환값2
        System.out.println(result);

//        if (pw.equals(input1)){  //문자열 비교시 == 사용금지, .equals 사용.
//            System.out.println("문이열렸습니다.");
//        } else {
//            System.out.println("비밀번호가 틀렸습니다.");
//        }


    }
}