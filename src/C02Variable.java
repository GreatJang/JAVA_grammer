import java.math.BigDecimal;

public class C02Variable {
    public static void main(String[] args) {
//        byte로 썼을때 -128~127까지의 표현이 가능하고, 그 이상을 세팅할때 오버/언더 플로우 발생.
//        byte num1 = 127;
//        byte num2 = -128;
//        num1 ++;
//        num2 --;
//        System.out.println(num1);
//        System.out.println(num2);
//
////        실수 : float, double(기본)
//        float f1 = 1.123456789f;
//        double b1 = 1.123456789;
//        System.out.println("f1 : " + f1);
//        System.out.println("b1 : " + b1);
//
////        부동소수점 오차 테스트
//        double double_num = 0.1;
////        미세오차는 조정되어 정상적으로 출력
//        System.out.println(double_num);
//
////        반복적인 연산시 오차가 확대되어 오차확인가능
//        double a = 0;
//        for(int i=0; i<1000; i++) {
//            a = a + 0.1 * 10;
//        }
//        System.out.println(a/10);

//        String abc = "hello";
//        double d1 = 1.03;
//        double d2 = 0.42;
//        System.out.println(d1-d2);
////        저장할때는 문자열 -> 연산할때는 정수로 변환 -> 최종결과는 실수로 반환
////        정밀한 소수점 계산 할때는 BigDecimal 사용
//        BigDecimal myBig1 = new BigDecimal("1.03");
//        BigDecimal myBig2 = new BigDecimal("0.42");
////        변환 타입이 다르기 때문에 나는 에러를 doubleValue를 통해 bigdecimal을 double 형으로 변환
//        double result = myBig1.subtract(myBig2).doubleValue();
//        System.out.println(myBig1.subtract(myBig2));

//        문자 : char
//        char my_char = '가';
//        System.out.println(my_char);
//
////        boolean : true(1) or false(0)
//        boolean my_bool = true;
//        System.out.println(my_bool);
////        my_bool은 이미 true값이 들어가 있으므로 my_bool만 넣어줘도 성립가능
//        if(my_bool) {
//            System.out.println("조건식이 참 입니다.");
//        }
//
//        int bool_num1 = 20;
//        int bool_num2 = 10;
////        조건식은 true아니면 false로 정의된다.
//        if(bool_num1 > bool_num2) {
//            System.out.println("조건식이 참 입니다.");
//        }

//        묵시적 타입변환
        char ch1 = 'a';
        int ch1_num = ch1;
        System.out.println(ch1_num);

        int my_int1 = 10;
        double my_double1 = my_int1;
        System.out.println(my_double1);
//        에러 발생 : my_int1 = my_double1;


    }
}