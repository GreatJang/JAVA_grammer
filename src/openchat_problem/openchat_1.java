package openchat_problem;

import java.util.*;
public class openchat_1 {
//    오픈채팅방 정민
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        List<String> answer = new ArrayList<>(); // List배열 answer 선언
        StringTokenizer st; // split 역할 // 문자열을 토큰화 한다.
        Map<String, String> hashMap = new HashMap<>(); // hashMap 선언

        for (int i=0; i<record.length; i++){
            st = new StringTokenizer(record[i]); // record 배열 요소 값을 StringTokenizer 나눈다.
            String str = st.nextToken();
            if(str.equals("Leave")) continue; // Leave
            hashMap.put(st.nextToken(), st.nextToken());
        }
        System.out.println(hashMap);

        for(String str : record){
            st = new StringTokenizer(str);
            String status = st.nextToken();
            String name = hashMap.get(st.nextToken()); // 키 값에 대한 value 출력
            if(status.equals("Enter")){
                answer.add(name+"님이 들어왔습니다.");
            } else if (status.equals("Leave")) {
                answer.add(name+"님이 나갔습니다.");
            }
        }
//        return answer.toArray(new String[0]);
    }
}
