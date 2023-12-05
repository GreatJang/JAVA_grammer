public class C02Variable {
    public static void main(String[] args) {
//        byte로 썼을때 -128~127까지의 표현이 가능하고, 그 이상을 세팅할때 오버/언더 플로우 발생.
        byte num1 = 127;
        byte num2 = -128;
        num1 ++;
        num2 --;
        System.out.println(num1);
        System.out.println(num2);

//        실수 : float, double(기본)
        float f1 = 1.123456789f;
        double b1 = 1.123456789;
        System.out.println("f1 : " + f1);
        System.out.println("b1 : " + b1);

//        부동소수점 오차 테스트
        double double_num = 0.1;
//        미세오차는 조정되어 정상적으로 출력
        System.out.println(double_num);

//        반복적인 연산시 오차가 확대되어 오차확인가능
        for(int i=0;i<100;i++){

        }
    }
}
