import java.util.Scanner;

public class C05LoopPractice {
    public static void main(String[] args) {
////        짝수의 합 계산하기
////        1~20까지 짝수의 합 출력
//        int result =0;
//        for(int a = 1; a <=20; a ++){
//            if(a%2 == 0){
//                result += a;
//            }
//        }
//        System.out.println(result);

////        숫자 뒤집기
//        int num = 1234;
//        int result = 0;
//        while(true){
//            int temp = num % 10;
//            result = result*10 + temp;
//            num /= 10;
//            if(num==0){
//                break;
//            }
//        }
//        System.out.println(result);

////        최대공약수 구하기
//        int a = 24; int b = 36;
//        int num = a > b ? b : a;
//        int maxNum = 0;
//        for(int i=1; i<=num; i++){
//            if(a % i == 0 && b % i == 0){
//                maxNum = i;
//            }
//        }
//        System.out.println(maxNum);
//
//        int minNum = a/maxNum * b/maxNum * maxNum;
//        System.out.println(minNum);



//        int a = 24; int b = 36;
//        int answer =0;
//        for(int i = 1; i <=24; i++){
//            answer = a / i;
//            if(36 % answer == 0){
//                System.out.println(answer);
//            }
//
//        }

////        라벨문 활용1
////        1) target이 matrix에 i,j번째 배열에 있는지 출력
////        2) target을 찾으면 반복문 전체 종료
////        3) 순차적으로 조회후에 label써서 첫번째 for문 종료
//        int[][] matrix = {{1,2,3,4},{5,6,7},{8,9},{10,11,12,13,14}};
//        int target = 11;
//        loop1:
//        for(int i=0; i<matrix.length; i++){
//            loop2:
//            for(int j = 0; j<matrix[i].length; j++){ // i번째 배열의 길이만큼
//                if(matrix[i][j] == target){
//                    System.out.println(i + ", " + j + " 번째에 있습니다.");
//                    break loop1;
//                }
//            }
//        }

//        라벨문 활용2
//        1~20 숫자가 있을 때, 이 중에 약수가 5개 이상인 숫자중에 가장 작은 값을 구하시오
//        불필요한 추가 반복 -> 라벨문
//        1)바깥 for문 : 1~20반복
//        2)안쪽 for문 : 약수찾기 for문
//        int answer = 0;
//        for(int i=0; i<21; i++){
//            int count =0;
//            for(int j=1; j<=i; j++){
//                if(i % j == 0){
//                    count ++;
//                }
//            }
//            if(count >= 5){
//                answer = i;
//                System.out.println(answer);
//                break;
//            }
//        }

//        라벨문 적용
        int answer = 0;
        l1:
        for(int i=0; i<21; i++){
            int count = 0;
            for(int j=1; j<=i; j++){
                if(i % j == 0){
                    count ++;
                }
                if(count == 5){
                    answer = i;
                    break l1;
                }
            }
        }
        System.out.println(answer);
    }
}
