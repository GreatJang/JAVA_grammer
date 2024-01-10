//import java.awt.Point;
//import java.util.*;
//import java.util.List;
//class Solution {
//    public int[] solution(int[] sequence, int k) {
//        int[] answer = new int[2];
//        List<Point> list = new ArrayList<>(); // Point 클래스안에 변수 x,y만 있는 리스트 선언
//        Point p = new Point(0,0); // start, end 인덱스 값
//        int sum = sequence[0]; // sum의 초기값 설정
//        while (true) { // while문 계속 실행
//            if (sum == k) { // sum이 k와 같으면
//                list.add(new Point(p.x, p.y)); //리스트에 start와 end값을 넣음.
//                sum -= sequence[p.x]; // 리스트에 담고 나서 sum값에 이전 x인덱스 sequence값을 빼준다.
//                p.x++; // 그 후 x인덱스 값 ++
//            } else if (sum > k) { // sum이 k보다 크면
//                sum -= sequence[p.x]; // sum값에 이전 x인덱스 sequence값을 빼준후
//                p.x++; // x인덱스 값 ++
//            } else { // sum < k
//                p.y++; // y인덱스 값 ++
//                if(p.y == sequence.length) break; // y인덱스 값이 sequence길이 값과 같으면 while문 종료
//                sum += sequence[p.y];
//            }
//        }
//        int min = Integer.MAX_VALUE; //2147483647값으로 초기화
//        for (Point point : list) { // 1, 1, 1, 2, 3, 4, 5에서 [0,3][3,4][6,6] y-x의 값=[3][1][0] min이 제일 작은 수로
//            //계속 초기화 되어서 min값이 제일 작은 [6,6]이 정답
//            int diff = point.y - point.x; // y-x의 차이값
//            if (min > diff) {
//                answer[0] = point.x;
//                answer[1] = point.y;
//                min = diff;
//            }
//        }
//        return answer;
//    }
//}