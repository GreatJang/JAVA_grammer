import java.util.Scanner;

public class C01InputOutput {
    public static void main(String[] args) {

////        출력 : System.out
//        int a = 20;
////        print는 출력후 줄바꿈 없음. println은 출력후 줄바꿈
//        System.out.print(a);
//        String myString = "hello world";
////        문자열과 숫자를 합하면 문자가 된다.
//        System.out.println(myString + a);
//        숫자와 숫자를 더하면 더하기 연산된다.
//        System.out.println(10+20);

//        입력 : System.in(키보드입력) + Scanner(입력을위한클래스)
//        Scanner myScan = new Scanner(System.in);
//        System.out.println("더하기를 할 숫자 2개를 입력해주세요");
//        int inputs_int1 = myScan.nextInt();
//        int inputs_int2 = myScan.nextInt();
//        System.out.println("입력하신 두 수를 더한 값은 " + (inputs_int1+inputs_int2) + "입니다.");
//        System.out.println("아무 문자열을 입력해주세요");
////        nextLine은 입력 받은 데이터를 한 줄 읽어서, String으로 리턴
//        String inputs = myScan.nextLine();
//        System.out.println("사용자가 입력한 문자열 : " + inputs);
//
////        nextInt은 입력 받은 데이터를 한 줄 읽어서, int으로 리턴
//        int inputs_int = myScan.nextInt();
//        System.out.println("사용자가 입력한 숫자는 : " + inputs_int);

//        Scanner myScan = new Scanner(System.in);
//        System.out.println("소수점 숫자를 입력해주세요");
//        double input_double = myScan.nextDouble();
//        System.out.println("사용자가 입력한 소수점 숫자 : " + input_double);

        Scanner myScan = new Scanner(System.in);
        System.out.println("true 또는 false를 입력해주세요");
        boolean input_boolean = myScan.nextBoolean();
        System.out.println("입력하신 true or false는 : " + input_boolean);

//        입출력 시스템 메모리 해제
//        써드 파티에 대한 사용 후 메모리 해제는 습관적으로 해주는게 좋다.
        myScan.close();
    }
}