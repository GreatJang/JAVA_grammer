import java.util.Scanner;

public class C01InputOutput {
    public static void main(String[] args) {

//        출력 : System.out
        int a = 20;
//        print는 출력후 줄바꿈 없음. println은 출력후 줄바꿈
        System.out.print(a);
        String myString = "hello world";
//        문자열과 숫자를 합하면 문자가 된다.
        System.out.println(myString + a);

//        입력 : System.in(키보드입력) + Scanner(입력을위한클래스)
        Scanner myScan = new Scanner(System.in);
    }
}
