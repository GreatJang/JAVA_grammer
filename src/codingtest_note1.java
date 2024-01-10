import java.util.*;
public class codingtest_note1 {
    public static void main(String[] args) {
        String[] operations = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        int[] answer = new int[2];
        Queue<Integer> pq = new PriorityQueue<>();
//        Map<String, String> hashMap = new HashMap<>(); // hashMap 선언
        for (String r : operations) { // enhanced for문으로 r에 record 요소값 넣음.
            String[] parts = r.split(" "); //r을 공백기준으로 나눠서 String 배열 parts에 넣음

            if(Integer.parseInt(parts[1]) <-1 || Integer.parseInt(parts[1])>1){
                pq.add(Integer.parseInt(parts[1]));
            }
            if(parts[1].equals("-1")){
                pq.poll();
            }
            if(parts[1].equals("1")){
                pq.peek();
            }
        }
        System.out.println(pq);
        if(!pq.isEmpty()){
            answer[0] = pq.peek();
            answer[1] = pq.poll();
        }
        System.out.println(Arrays.toString(answer));
    }
}
