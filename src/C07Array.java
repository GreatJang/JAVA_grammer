import com.sun.jdi.connect.AttachingConnector;

import java.lang.module.FindException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

public class C07Array {
    public static void main(String[] args) {

////        표현식1
//        int[] int_arr1 = {1,2,3,4};
////        표현식2
//        int[] int_arr2 = new int[4];
//        int_arr2[0]=1;
//        int_arr2[1]=2;
//        int_arr2[2]=3;
//        int_arr2[3]=4;
////        표현식3
//        int[] int_arr3 = new int[]{1,2,3,4};
//        표현식4는 불가 : java의 배열은 반드시 길이가 지정되어야함.
//        int[] int_arr4 = new int[];

//        String[] arr_st = new String[5]; // null 값 세팅
//        for(int i=0; i<arr_st.length; i++){ // ⭐String은 null 값 가지고 뭘 하지 말라고 함. NullPointerException 에러
//        에러나면 그 부분에서 런닝이 멈춰버리기 때문에 나중에 예외처리도 배울예정
//            if(arr_st[i].isEmpty()){
//                System.out.println("비어있습니다.");
//            }
//        }

////        ⭐85, 65, 90 인 int 배열을 선언한 뒤, 총합, 평균값/
//        int[] int_arr = {85,65,90};
//        int answer = 0;
//        for(int i=0; i<int_arr.length; i++){
//            answer += int_arr[i];
//        }
//        System.out.println(answer);
//        System.out.println(answer/int_arr.length);

////        ⭐최대값, 최소값
//        int[] arr = {10,20,30,12,8,17};
//        int max = arr[0];
//        int min = arr[0];
//        for(int i=0; i<arr.length; i++){
//            if(max<arr[i]){
//                max = arr[i];
//            }
//            if(min>arr[i]){
//                min = arr[i];
//            }
//        }

////        ⭐배열의 순서바꾸기 문법
//        int[] arr = {10,20};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//        System.out.println(Arrays.toString(arr));

////        0번째 index부터 마지막까지 자리 change
//        int[] arr2 = {10,20,30,40,50,60,70};
//        for(int i=0; i<arr2.length-1; i++){ // 10이 뒤로 가는데 까지 6번 자리가 바뀌어야 한다. .length에 -1을 하지 않으면
////            배열의 길이에 맞지 않게 for문이 돌기 때문에 에러가 난다. // ArrayIndexOutOfBoundsException 에러
//            int temp = arr2[i];
//            arr2[i] = arr2[i+1];
//            arr2[i+1] = temp;
//        }
//        System.out.println(Arrays.toString(arr2));

//        ⭐배열 뒤집기
//        int[] arr = {1, 2, 3, 4, 5}; // arr 0번째는 arr2의 length-1번째에 넣기 ~
//        신규배열 선언 : arr2
//        int[] arr2 = new int[arr.length]; // 배열은 길이를 먼저 확정해줘야 한다.
//        for (int i=0; i<arr.length; i++) {
//            arr2[arr2.length-1-i] = arr[i];
//        }
//        System.out.println(Arrays.toString(arr2));

////        ⭐배열 뒤집기2
//        for(int i=0; i<arr.length/2; i++){
//            int temp = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

////        ⭐정렬 : sort() 함수 사용
//        int[] arr = {5,1,2,7,3,1,2};
////        오름차순정렬이 기본
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

////        내림차순
////        방법1.Comparator클래스 사용
////        객체타입인 경우에만 Comparactor클래스 사용 가능
//        String[] st_arr = {"hello", "hi", "bye", "goodmorning"};
//        Arrays.sort(st_arr); // 문자 정렬도 가능
//        System.out.println(Arrays.toString(st_arr));
//
//        Arrays.sort(st_arr, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(st_arr));

//        Comparator클래스는 기본형 타입은 처리불가
//        Arrays.sort(arr, Comparator.reverseOrder());
//        기본형은 Integer로 변경해서 사용해야함
//        Integer[] arr_integer = {5,1,2,7,3,1,2};
//        Arrays.sort(arr_integer, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(arr_integer));


////        방법2.배열 뒤집기
//        for(int i=0; i<arr.length/2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }
//        System.out.println(Arrays.toString(arr));
//
////        ⭐StreamApi, lambda를 활용한 내림차순 정렬 // 많이 사용함 달달외우는 것보다 이렇게도 할 수 있다 인지하기.
//        int[] arr2 = {5,1,2,7,3,1,2};
//        int[] new_arr2 = Arrays.stream(arr2) //arr2를 대상으로 stream객체 생성하는 문법
//                                            .boxed() //Integer로 형변환 한 스트링객체생성
//                                            .sorted(Comparator.reverseOrder()) //내림차순정렬
//                                            .mapToInt(a->a) //Integer를 int로 변환
//                                            .toArray(); //배열로 변환

//        int [] arr = {30,22,20,25,12};
//
////        오름차순 선택정렬
//        for(int i=0; i<arr.length-1; i++){ // 마지막 자리값은 자기 자신과 비교하는 것이기 때문에 할 필요 없으므로 -1
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i]>arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//
////        내림차순 선택정렬
//        for(int i=0; i<arr.length-1; i++){ // 마지막 자리값은 자기 자신과 비교하는 것이기 때문에 할 필요 없으므로 -1
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i]<arr[j]){ // 부등호만 바꾸어주면 내림차순 정렬
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

////        숫자 조합의 합 : 각기 다른 숫자의 배열이 있을 때 만들어질수 있는 2개의 조합의 합을 출력하라.
//        int[] int_arr = {10,20,30,40,50,60};
//        for(int i=0; i<int_arr.length-1; i++){
//            for(int j=i+1; j< int_arr.length; j++){
//                System.out.println(int_arr[i] + " + " + int_arr[j] + " = " + (int_arr[i] + int_arr[j]));
//            }
//        }

//        중복제거하기
        int[] temp = {10,10,40,5,7};
////        정렬하고 나서 값 하나씩 비교해서 중복제거
////        배열복사
//        int[] new_temp = Arrays.copyOfRange(temp,0,3);
//        System.out.println(Arrays.toString(new_temp));

        Arrays.sort(temp);
        int[] new_temp = new int[temp.length];
        int index = 0;
        for(int i=0; i<temp.length; i++){
            if(i==temp.length-1){ //마지막 자리 체크로직
                new_temp[index] = temp[i];
                index++;
                break;
            }
            if(temp[i] != temp[i+1]){
                new_temp[index] = temp[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(new_temp));







    }
}


