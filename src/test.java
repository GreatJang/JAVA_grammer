import java.util.*;

public class test {
    public static void main(String[] args) {
//        10 이하 합성수는 4, 6, 8, 9, 10 로 5개입니다. 따라서 5를 return합니다.
        int n = 10;
        int count =0;
        int answer = 0;
        for (int i = 4; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count+=1;
                }
            }
            if (count >= 3) {
                answer++;
                i++;
            }
        }

//        if (count >= 3) {
//            answer++;
//            count = 0;
//        }
        System.out.println(answer);
//      return answer;

    }
}

