package C15AnonymousLambda;
//인터페이스 선언 : LambdaInterface
// => makeString, 매개변수 String 2개
// LambdaExpression 클래스의 main에서
// LambdaInterface 익명객체를 화살표함수 방식으로 구현
// => 2개의 문자열을 받아서 더해서 출력
public class C1503LambdaExpression {
    public static void main(String[] args) {
//        실행문 1개 일때는 return 생략
//        실행문 2개 이상일 때는 return 필요
//        매개변수를 순서로 인지하므로, 타입을 지정해줄필요는 없다.
        LambdaInterface lambdaInterface = (i, j, k) -> { // 변수이름은 중요하지 않음 순서로 반영됌
            String answer = i+j;
            return answer;
        };
        System.out.println(lambdaInterface.makeString("hello", "java", 0));
    }
}

interface LambdaInterface{ // interface에서는 선언만 구현 X
    String makeString(String a, String b, int c);
}
