import java.util.Scanner;
import java.util.Stack;

public class C11StackQueue {
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

//        웹사이트 방문 구현
        Stack<String> backwards = new Stack<>();
        Stack<String> forwards = new Stack<>();
        while(true){
            System.out.println("신규사이트 방문시 1번, 앞으로가기 2번, 뒤로가기 3번");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if(input.equals("1")){
                System.out.println("방문하신 사이트를 입력해주세요");
                Scanner sc2 = new Scanner(System.in);
                String input2 = sc2.nextLine();
                System.out.println("방문하신 사이트는 " + input2 + "입니다.");
                backwards.push(input2);

            }else if (input.equals("2")){
                String temp = forwards.pop();
                backwards.push(temp);
                System.out.println("앞으로 가기를 통해 방문한 곳은 " + temp +"입니다.");


            }else{
                String temp = backwards.pop();
                forwards.push(temp);
                System.out.println("뒤로가기로 방문하신 곳은 " + backwards.peek() + "입니다.");

            }
        }





    }
}
