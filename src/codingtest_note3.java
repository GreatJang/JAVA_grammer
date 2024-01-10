import java.util.*;
public class codingtest_note3 {
    public static void main(String[] args) {
        //포인터 두개를 두고 start 고정 start +end가 7보다 작으면 end 하나씩 증가
        //7보다 크면 start 하나씩 증가
        int[] sequence = {1, 2, 3, 4, 5};
        int k = 7;
        List<Integer> list = new ArrayList<>();
        int start = 0;
        int end = 0;
        int sum =0;
        for(int i=start; i<end+1; i++){
            sum += sequence[i];
        }
        while (true){
            if(sequence[start]+sequence[end]<k){
                end ++;
            }
            else if(end == sequence.length) {
                break;
            }
            else if(sequence[start]+sequence[end]>k){
                start ++;
            }
            if(sum==k){
                list.add(start);
                list.add(end);
            }
        }
        System.out.println(list);

    }
}
