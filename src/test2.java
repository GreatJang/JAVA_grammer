import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class test2 {
    public static void main(String[] args) {
        int[] scoville = {1,2,3,9,10,12};
        int K=7;

        int answer = 0;
        Queue<Integer> myQue = new PriorityQueue<>();
        for(int a : scoville){
            myQue.add(a);
        }
        for (int i = 0; i <= K; i++) {
            if(myQue.size() == 1 && myQue.peek()<K){
                break;
            }
            if(myQue.peek()>=K){
                break;
            }
            int temp = myQue.poll();
            int temp1 = myQue.poll();
            int temp2 = temp + (temp1*2);
            myQue.add(temp2);
            answer ++;

        }
        System.out.println(answer);


//        int temp = myQue.poll();
//        int temp1 = myQue.poll();
//        System.out.println(myQue);
//        int temp2 = temp + (temp1*2);
//        myQue.add(temp2);
//        System.out.println(myQue);

//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq);
////        내부적으로 힙 자료구조를 가지고 있기 때문에 정렬이 깔끔하지 않다. 원칙적으로는 맨 앞에 제일 작은 값이 있다.
//        while(!pq.isEmpty()){
//            System.out.println(pq.poll());
//        myQQ.add("문서1");
//        myQQ.add("문서2");
//        myQQ.add("문서3");
//        while(!myQQ.isEmpty()){
//            System.out.println("현재 인쇄중인 문서 : " + myQQ.poll());
//        }


    }
}
