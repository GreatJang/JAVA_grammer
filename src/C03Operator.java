public class C03Operator {
    public static void main(String[] args) {
//        산술연산자
        int num1=8, num2=3;
//        *, /나눗셈, &나머지
        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
//        몫만 구하면 int로, 소수점 자리까지 구하려면 double
        System.out.println("num1 / num2 = " + (num1 / (double)num2));
        System.out.println("num1 & num2 = " + (num1 & num2));

//        대입연산자
        int n1=7, n2=7, n3=7;
        n1 = n1-3; // 4
        n2 -= 3; // 4
        n3 = -3; // -3

//        /=, %=
        int n4 = 10; int n5 = 10;
        n4 /= 3;
        n5 %= 3;
        System.out.println("n4 = " + n4 + " n5 = " + n5);
    }
}
