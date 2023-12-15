package Java_Basic;

import java.util.*;

public class C11StackQueueDeque {
    public static void main(String[] args) {
//        Stack<Integer> mySt = new Stack<>();
//        mySt.push(10);
//        mySt.push(20);
//        mySt.push(30);
////        ⭐pop : 스택에서 요소를 제거 후 해당 요소 반환
//        System.out.println(mySt.pop()); //30
////        ⭐peek : 스택에서 마지막 요소 반환. 제거X
//        System.out.println(mySt.peek()); ///20
//        System.out.println(mySt); //10, 20
//        System.out.println(mySt.size());
//        System.out.println(mySt.isEmpty());

////        String타입 5개 정도 추가 후 while문을 통해 모두 출력
//        Stack<String> myStSt = new Stack<>();
//        myStSt.push("java");
//        myStSt.push("python");
//        myStSt.push("c++");
//        myStSt.push("javascript");
//        myStSt.push("node");
//        while(!myStSt.isEmpty()){
//            System.out.println(myStSt.pop());
//        }

//        웹페이지 방문 뒤로가기 기능 구현
//        방문한 사이트 출력 + history
//        뒤로가기 기능도 있어야함
//        스캐너로 신규사이트 방문 or 뒤로가기
//        신규사이트 방문일 경우, 해당 주소 push
//        뒤로가기일 경우 해당 주소 pop
//        while(true) {
//        Stack<String> myHistory = new Stack<>();
//        System.out.println("신규사이트 방문일 경우 1번을 눌러주세요");
//        System.out.println("뒤로가기일 경우 0번을 눌러주세요");
//        Scanner mySc = new Scanner(System.in);
//        int mySc_num = mySc.nextInt();
//
//            if (mySc_num == 1) {
//                System.out.println("신규사이트 주소를 입력해주세요");
//                Scanner mySc1 = new Scanner(System.in);
//                String mySc1_address = mySc1.nextLine();
//                myHistory.push(mySc1_address);
//                System.out.println(mySc1_address + " 로 이동하겠습니다.");
//            }
//            if (mySc_num == 0) {
//                System.out.println(myHistory.pop());
//
//            }
//        }

////        웹사이트 방문 구현
//        Stack<String> backwards = new Stack<>();
//        Stack<String> forwards = new Stack<>();
//        while(true){
//            System.out.println("신규사이트 방문시 1번, 앞으로가기 2번, 뒤로가기 3번");
//            Scanner sc = new Scanner(System.in);
//            String input = sc.nextLine();
//            if(input.equals("1")){
//                System.out.println("방문하신 사이트를 입력해주세요");
//                Scanner sc2 = new Scanner(System.in);
//                String input2 = sc2.nextLine();
//                System.out.println("방문하신 사이트는 " + input2 + "입니다.");
//                backwards.push(input2);
//
//            }else if (input.equals("2")){
//                String temp = forwards.pop();
//                backwards.push(temp);
//                System.out.println("앞으로 가기를 통해 방문한 곳은 " + temp +"입니다.");
//
//
//            }else{
//                String temp = backwards.pop();
//                forwards.push(temp);
//                System.out.println("뒤로가기로 방문하신 곳은 " + backwards.peek() + "입니다.");
//
//            }
//        }

////        큐선언
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//        System.out.println(myQue.poll());
//        System.out.println(myQue);

////        프린터대기열 예제
////        문서1추가, 문서2추가, 문서3추가
////        while문을 통해 "현재 인쇄중인 문서 : "
//        Queue<String> myQQ = new LinkedList<>();
//        myQQ.add("문서1");
//        myQQ.add("문서2");
//        myQQ.add("문서3");
//        while(!myQQ.isEmpty()){
//            System.out.println("현재 인쇄중인 문서 : " + myQQ.poll());
//        }

////        길이의 제한이 있는 큐 : ArrayBlockingQueue
//        Queue<String> myQue = new ArrayBlockingQueue<>(3);
////        add와 offer의 차이 : add는 길이가 다 찼을 때 에러를 발생(IllegalStateException: Queue full). offer는 공간이 충분할 때까지만 add
//        myQue.offer("hello1");
//        myQue.offer("hello2");
//        myQue.offer("hello3");
//        myQue.offer("hello4"); // offer 시 hello4번은 공긴이 없어서 안들어감.
//        System.out.println(myQue);


//        ⭐우선순위 큐

//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq);
////        내부적으로 힙 자료구조를 가지고 있기 때문에 정렬이 깔끔하지 않다. 원칙적으로는 맨 앞에 제일 작은 값이 있다.
//        힙 자료구조는 완전 이진트리
//        while(!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }
//



//////        ⭐프로그래머스 더 맵게 문제
//        int[] scoville = {1,2,3,9,10,12};
//        int K=7;
////
////        list로 변환 -> int temp = get(0) + get(1)*2;
////        remove(0), remove(0)
//
////        List로 문제 풀이 시 시간 효울성 에러
//        List<Integer> myList  = new ArrayList<>();
//        for(int a : scoville){
//            myList.add(a);
//        }
//        int answer = 0;
//                while(true){
//                    if(myList.get(0) >= K){
//                        break;
//                    }else if(myList.size() == 1 && myList.get(0)<K){
//                        answer = -1;
//                        break;
//                    }else{
//                        answer++;
//                        int temp = myList.get(0) + myList.get(1)*2;
//                        myList.remove(0);
//                        myList.remove(0);
//                        myList.add(temp);
//                        Collections.sort(myList);
//                    }
//
//                }
//                System.out.println(answer);


////        내 풀이
//        int answer = 0;
//        Queue<Integer> myQue = new PriorityQueue<>();
//        for(int a : scoville){
//            myQue.add(a);
//        }
//        for (int i = 0; i <= K; i++) {
//            if(myQue.size() == 1 && myQue.peek()<K){
//                answer = -1;
//                break;
//            }
//            if(myQue.peek()>=K){
//                break;
//            }
//            int temp = myQue.poll();
//            int temp1 = myQue.poll();
//            int temp2 = temp + (temp1*2);
//            myQue.add(temp2);
//            answer ++;
//
//        }
//        System.out.println(answer);


//        ArrayDeque : 양방향에서 데이터를 삽입 / 제거 할 수 있다.
//        Deque<Integer> myDeque = new ArrayDeque<>();
//        myDeque.addFirst(10);
//        myDeque.addFirst(20);
//        System.out.println(myDeque); //20,10
//        myDeque.addLast(30);
//        System.out.println(myDeque); //20,10,30
//
//        System.out.println(myDeque.pollFirst()); //20
//        System.out.println(myDeque.pollLast()); //30
//        System.out.println(myDeque); //10

//        프로그래머스 올바른 괄호
        String s = "(())()"; // ")()("
        boolean answer = true;
        Deque<Character> myDeque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if(myDeque.isEmpty()){
                myDeque.addLast(s.charAt(i));
                if (s.charAt(i) ==')'){
                    answer = false;
                    break;
                }
            }else{
                if(myDeque.peekLast()=='(' && s.charAt(i)==')'){
                    myDeque.pollLast();
                }else{
                    myDeque.addLast(s.charAt(i));
                }
            }
        }
        if(!myDeque.isEmpty()){
            answer = false;
        }




//        내 풀이
//        char[] my_char = s.toCharArray();
//        Deque<String> myDeque = new ArrayDeque<>();
//        System.out.println(my_char);
//        boolean answer = true;
//
//        for (int i = 0; i < my_char.length; i++) {
//            myDeque.addLast(String.valueOf(my_char[i]));
//        }
//        if(myDeque.peekFirst() == ")" ){
//            answer = false;
//
//        }else if(myDeque.pollLast() == ")" ){
//            answer = false;
//        }
//        System.out.println(answer);

//
//            // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//            System.out.println("Hello Java");









    }
}
