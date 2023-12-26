package C17ExceptionFileParsing;

import java.util.Scanner;

public class C1701Exception {
    public static void main(String[] args) {
////        ArithmeticException : 0으로 나눌때
//        System.out.println("나눗셈 프로그램입니다. 숫자10에 나눌 분모값을 입력해주세요");
//        int num = 10;
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
////        예외가 발생할 것으로 예상되는 코드에 try catch 감싸준다.
//        try {
//            System.out.println("10에 " + input + "을 나누면 ");
//            System.out.println(num / input + "입니다."); // 이 부분에서 에러나기때문에 출력 X
////            catch에는 try구문안에서 발생가능한 예외사항을 적어야 정상적으로 catch가 된다.
////            Exception으로 다 처리하는게 아니라 발생가능한 예외사항을 적는 이유는 해당 예외사항에 대해 적절한 문구와 화면을 출력해주기 위해서이다.
//        } catch (IllegalArgumentException e) {
//            System.out.println("정상적이지 않은 입력값을 넣었습니다.");
//            e.printStackTrace();
//        } catch (ArithmeticException e) { // 스프링에는 로그남기는게 중요
//            System.out.println("0으로 나누시면 안됩니다.");
////            e안에 예외관련된 정보들이 들어있음.
//            System.out.println(e.getMessage());
//            e.printStackTrace(); // 어떤자바 코드에 에러가 발생했는지 확인가능
//        } catch (Exception e) { // 모든 예외처리를 포함하고 있는 상위 예외처리. // 제일 마지막에 넣어줘야 예상할수 없는 예외처리를 발생 시킬 수 있음.
//            System.out.println("알수 없는 예외가 발생했습니다.");
//            e.printStackTrace();
//        } finally {
////            반드시 실행되어야 하는 구문 삽입
//        }
//        System.out.println("감사합니다.");


//        throw와 throws예제
//        로그인 예제
//        사용자에게 예외가 발생했음을 명확하게 알려주어야 한다.
        String password = "1234";
        try {
            login(password);
        }catch (IllegalArgumentException e){
//            ⭐e.getMessage는 login메서드에서 throw new 한 곳에서 넘어온 메세지이다. //51, 51번줄
            System.out.println(e.getMessage());
        }
    }
//    ⭐unchecked exception에서 throws를 하지 않더라도 예외는 호출한 곳으로 전파
//    이때에 throws를 하는 이유는 명시적으로 예외가 발생할 수 있음을 알리는 것일 뿐이다.

//    ⭐checked exception은 예외처리가 강제되고, 해당메서드에서 예외처리를 하든지 throws를 통해 호출한 곳에 위임하여야 한다.
//    이때에 호출한 쪽에서는 예외처리가 강제된다.
    static void login(String password){
        if(password.length()<10){
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
        }
//        unchecked exception은 강제 예외처리가 아니기 때문에 예외처리를 안해주어도 되긴한다.
//        스프링에서는 try/catch를 자동화 해주는 기능이 있기 때문에 throw를 적재적소에 잘 사용하는게 더 중요함.
    }
}
