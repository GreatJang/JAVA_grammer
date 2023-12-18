import java.util.*;
public class practice_Map {
    public static void main(String[] args) {
//        <String, String> -> Map
//        삽입된 데이터에 순서가 없다.
//        Map<String, String> myMap = new HashMap<>();
//        myMap.put("basketball", "농구");
//        myMap.put("soccer", "축구");
//        myMap.put("baseball", "야구");
//        System.out.println(myMap);
//        System.out.println(myMap.get("basketball"));
//
////        size(), isEmpty()사용가능
//
////        이미 key가 있을경우 put을 하면 덮어쓰기
//        myMap.put("basketball", "탁구");
////        없으면 put이 putIfAbsent
//        myMap.putIfAbsent("baseball", "배구");
//        System.out.println(myMap);
//
////        getOrDefault : key가 없으면 default값 return
//        System.out.println(myMap.getOrDefault("tennis", "스포츠"));
//
////        해당 키값이 있는지 없는지 확인 boolean
//        System.out.println(myMap.containsKey("tennis"));
//
////        해당 키값 삭제
//        myMap.remove("baseball");
//        System.out.println(myMap);
//
////        키 목록만 뽑는 메서드
//        System.out.println(myMap.keySet());
////        value 목록만 뽑는 메서드
//        System.out.println(myMap.values());
//
////        enhanced for문 : key값 하나씩 출력
//
//        for(String a : myMap.keySet()){
//            System.out.println(myMap.get(a));
//        }
//
//        Map<String, String> myMap = new HashMap<>();
//        myMap.put("basketball", "농구");
//        myMap.put("soccer", "축구");
//        myMap.put("baseball", "야구");
//
////        iterator를 통해 key값 하나씩 출력. iterator로 값을 쉽게 뽑아낼 수있다.
//        Iterator<String> myIter = myMap.keySet().iterator();
////        next(메서드는 데이터를 소모시키면서 return
////        System.out.println(myIter.next()); //next 소모시키는 메소드 //원본에는 영향없음. Iterator에 영향
////        System.out.println(myIter);
////        hasNext() : iterator안에 값이 있는지 없는지 true/fasle
//        while(myIter.hasNext()){
//            System.out.println(myIter.next());
//        }

//        아래의 리스트를 가지고 좋아하는 운동종목과 사람숫자를 map 형태로 나타내시오.
        List<String> myList = new ArrayList<>();
        myList.add("basketball");
        myList.add("basketball");
        myList.add("basketball");
        myList.add("baseball");
        myList.add("baseball");
        myList.add("tennis");
        myList.add("tennis");
        myList.add("tennis");
//
//        int count = 1;
//        Map<String, Integer> myMap = new HashMap<>();
//        for(int i = 0; i < myList.size(); i++){
//            if(myMap.containsKey(myList.get(i)) == true){
//                count++;
//            }else{
//                count =1;
//            }
//            myMap.put(myList.get(i), count);
//        }
//        System.out.println(myMap);
//
//        Map<String, Integer> myMap = new HashMap<>();
//        for(String a : myList){
//            if(myMap.containsKey(a)){
//                myMap.put(a, myMap.get(a)+1);
//            }else{
//                myMap.put(a,1);
//            }
//        }
//        System.out.println(myMap);


//        완주하지 못한 선수
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        Map<String, Integer> myMap = new HashMap<>();
        for(String a : participant){
            if(myMap.containsKey(a)){
                myMap.put(a, myMap.get(a)+1);
            } else{
                myMap.put(a,1);
            }
        }

        for(String a : completion){
            if(myMap.get(a) >= 1){
                myMap.put(a, myMap.get(a)-1);
            }
            if(myMap.get(a) < 1){
                myMap.remove(a);
            }
        }
        String answer = " ";
        for(String a : myMap.keySet()){
            answer +=a;
        }
        System.out.println(answer);

















    }
}
