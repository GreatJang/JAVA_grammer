import java.util.*;
public class testtt {
    //오픈채팅만 희준누나
    public static void main(String[] args) {
        List<String> answer = new ArrayList<>();
        Map<String,String> userId= new HashMap<>();
        for (String r : record) { // enhanced for문으로 r에 record 요소값 넣음.
            String[] parts = r.split(" "); //r을 공백기준으로 나눠서 String 배열 parts에 넣음
            if (parts[0].equals("Enter") || parts[0].equals("Change")) { //parts의 0번째 요소가 Enter이거나 Change이면
                userId.put(parts[1], parts[2]); // Map에 userID를 키로 이름을 value로 넣는다.
            }
        }// uid1234, Muzi// uid4567 Prodo // uid1234 Prodo // uid4567 Ryan


//        Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"
        for (String r : record) { // enhanced for문으로 r에 record 요소값 넣음.
            String[] parts = r.split(" "); //r을 공백기준으로 나눠서 String 배열 parts에 넣음
            if (parts[0].equals("Enter")) { //parts의 0번째 요소가 Enter이면
                answer.add(userId.get(parts[1]) + "님이 들어왔습니다.");
            } else if (parts[0].equals("Leave")) {
                answer.add(userId.get(parts[1]) + "님이 나갔습니다.");
            }
        }
        System.out.println(answer);
    }
}
