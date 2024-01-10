import java.util.Arrays;
import java.util.*;

public class testtest {
    public static void main(String[] args) {
        //map에 id와 이름을 저장 매핑
        //Enter 포함이면 map value 값으로 뽑아내기
        String[] answer = new String[4];
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        Map<String, String> myMap1 = new LinkedHashMap<>();
        for(int i=0; i< record.length; i++) {
            int a = record[i].indexOf("uid");
            if(record[i].substring(0, 5).equals("Enter") || record[i].substring(0, 5).equals("Change")){
                myMap1.put(record[i].substring(a, a+7), record[i].substring(a+8, record[i].length()));
            }
        }
        System.out.println(myMap1);

        for(int i=0; i< record.length; i++){
            int a = record[i].indexOf("uid");
            if(record[i].contains("Enter")){
                if(record[i].substring(a, a + 7).equals("uid1234")){
                    answer[i] = (myMap1.get(record[i].substring(a, a + 7)) + "님이 들어왔습니다.");
                }
                if(record[i].substring(a, a + 7).equals("uid4567")){
                    answer[i] = (myMap1.get(record[i].substring(a, a + 7)) + "님이 들어왔습니다.");
                }
            }
            if(record[i].contains("Leave")){
                if(record[i].substring(a, a + 7).equals("uid1234")){
                    answer[i] = (myMap1.get(record[i].substring(a, a + 7)) + "님이 나갔습니다.");
                }
                if(record[i].substring(a, a + 7).equals("uid4567")){
                    answer[i] = (myMap1.get(record[i].substring(a, a + 7)) + "님이 들어왔습니다.");
                }
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
