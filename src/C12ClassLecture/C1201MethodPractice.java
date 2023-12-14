package C12ClassLecture;

public class C1201MethodPractice {
    public static void main(String[] args) {
//        소수 : 1과 자기자신을 제외하고 나누어지는 수가 없는 숫자
//        소수인지 아닌지 판별하는 메서드 생성
//        리턴타입 boolean 소수이면 true, 아니면 false
//        main메서드에서 호출하여 테스트

    }
    static boolean isPrime(int num){
        boolean answer = true;
        for(int i=2; i*i<=num; i++){ // 소수문제 풀때 시간 복잡도 문제로 통과 안되기 때문에 제곱근 조건 i*i로 조건 주기
            if(num % i ==0){
//                메서드가 return을 만나면 바로 종료
//                void 리턴타입 메서드에서도 강제종료를 위해 return 사용가능
                return false;
            }
        }
        return answer;
    }

    static void isPrimePrint(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("소수가 아닙니다.");
                return; // num이 i로 나누어 져서 소수입니다. 를 출력하고 나서 return을 만나 그냥 종료되어버림.
            }
        }
        System.out.println("소수입니다.");
    }
}
