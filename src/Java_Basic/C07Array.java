package Java_Basic;

import com.sun.jdi.connect.AttachingConnector;

import java.lang.module.FindException;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

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
        int[] arr = {10,20,30,12,8,17};
        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }

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
////        ⭐오름차순 선택정렬
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
//            for(int j=i+1; j<int_arr.length; j++){
//                System.out.println(int_arr[i] + " + " + int_arr[j] + " = " + (int_arr[i] + int_arr[j]));
//            }
//        }

////        중복제거하기
//        int[] temp = {10,10,40,5,7};
//////        정렬하고 나서 값 하나씩 비교해서 중복제거
//////        배열복사
////        int[] new_temp = Arrays.copyOfRange(temp,0,3);
////        System.out.println(Arrays.toString(new_temp));
//
//        Arrays.sort(temp);
//        int[] new_temp = new int[temp.length];
//        int index = 0;
//        for(int i=0; i<temp.length-1; i++){
//            if(temp[i] != temp[i+1]){
//                new_temp[index] = temp[i];
//                index++;
//            }
//        }
////        마지막 자리 체크로직
//        new_temp[index++] = temp[temp.length-1];
//
//        int[] answer = Arrays.copyOfRange(new_temp,0,index);
//        System.out.println(Arrays.toString(answer));

////        프로그래머스 두 개 뽑아서 더하기
//        int[] numbers = {2,1,3,4,1}; //2,3,4,5,6,7
//
//        int[] numbers_combination = new int[numbers.length*numbers.length]; // 두개 뽑아서 더하는 로직 시작 // numbers_combination 배열 크기 넓게 시작
//        int combination_count = 0;
//        for(int i=0; i<numbers.length-1; i++){
//            for(int j=i+1; j< numbers.length; j++){
//                numbers_combination[combination_count] = numbers[i]+numbers[j];
//                combination_count++;
//            }
//        }
//        int[] temp = Arrays.copyOfRange(numbers_combination,0,combination_count); // 새로운 int배열 생성해서 copyOfRange로 필요한 값만 잘라서 넣기
//        System.out.println(Arrays.toString(temp));
//        Arrays.sort(temp); // 정렬
//        int[] new_temp = new int[temp.length]; // 중복제거 시작
//        int index = 0;
//        for(int i=0; i<temp.length-1; i++) {
//            if (temp[i] != temp[i + 1]) {
//                new_temp[index] = temp[i];
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(new_temp)); // 중복제거를 완료하면 new_temp 빈자리에 0으로 채워짐
//        new_temp[index++] = temp[temp.length-1]; // 마지막 자리 체크
//        int[] answer = Arrays.copyOfRange(new_temp,0,index); // 새로운 int배열 생성해서 copyOfRange로 필요한 값만 잘라서 넣기 = 빈자리 0 버리기
//        System.out.println(Arrays.toString(answer));


////        버블정렬
//        int[] arr = {5,1,4,3,2};
//        for(int i=0; i<arr.length-1; i++){
//            boolean isChanged = false; // for문이 다 돌기 전에 정렬이 완료 되면 멈추는 로직 추가
//            for(int j=0; j<arr.length-1-i; j++){
//                // for문이 j까지 인데 if 절에 j+1이 있으면 무조건 for문에서 배열초과 되기때문에 -1을 해주어야 한다.
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    isChanged = true; // for문을 돌면 true for문을 돌지 않으면 false
//                }
//            }
//            if(isChanged == false){ // for문을 돌지 않으면 false 이기 때문에 false이면 반복문 종료
//                break;
//            }
//        }
//        System.out.println(Arrays.toString(arr));

////        배열의 검색
//        int[] arr = {5,3,1,8,7};
//        int answer=0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==8){
//                answer=i;
//                break;
//            }
//        }
//        System.out.println(answer);

////        이진검색(Binary Search) 알고리즘
////        사전에 오름차순 정렬이 되어 있어야 이진검색 가능.
////        우리가 구하는 값이 어떤 전체 n을 2로 반복해서 나누는 값이라면 log2n의 값과 일치 할것
////        =>시간복잡도가 log2n이다.(n값이 크면 클수록, 복잡도가 굉장히 줄어듬)\
//
//        int[] arr = {1,3,6,8,9,11};
//        int answer = Arrays.binarySearch(arr,8);
//        System.out.println(answer);
//
////        스트림 api를 활용한 검색
////        int index = Arrays.stream(arr).filter(a->a==8).findFirst().getAsInt();
////        System.out.println(index);
//        int index = IntStream.range(0, arr.length)
//                .filter(i -> arr[i] == 8)
//                .findFirst()
//                .orElse(-1);
//        System.out.println(index);

////        배열간 비교 : equals, 순서까지 동일해야 true //활용도 낮음
//        int[] arr1 = {10,20,30};
//        int[] arr2 = {10,20,30};
//        System.out.println(Arrays.equals(arr1, arr2));
//
////        배열복사 : copyOf(배열, end), copyOfRange(배열, start, end) //활용도 낮음
//        int[] arr = {10,20,30,40,50};
//        int[] new_arr1 = Arrays.copyOf(arr, 10);
//        int[] new_arr2 = Arrays.copyOfRange(arr, 1, 4);
//        System.out.println(Arrays.toString(new_arr1));
//        System.out.println(Arrays.toString(new_arr2));

////        2차원 배열 할당
//        int[][] arr = new int[2][3];
////        {{1,2,3},{4,5,6}}
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//        arr[1][0] = 4;
//        arr[1][1] = 5;
//        arr[1][2] = 6;
//        System.out.println(Arrays.deepToString(arr));
//
////        2차원 가변배열 선언 및 할당
//        int[][] arr2 = new int[3][];
//        arr2[0] = new int[1];
//        arr2[1] = new int[2];
//        arr2[2] = new int[3];
////        arr2[0][0] = 10; // 전체 사이즈를 지정하지 않고 값만 입력하려고 하면 런타임 에러난다. NullPointerException
////        arr2[1][0] = 20;
////        arr2[2][0] = 30;
//        System.out.println(Arrays.deepToString(arr2)); // 배열안에 배열이 들어가 있으니까 배열주소를 출력한다.
//
////        가변배열 리터럴 방식
//        int[][] arr3 = {{10}, {10,20},{10,20,30}};
//        System.out.println(Arrays.deepToString(arr3));

////        [3][4] 사이즈의 배열을 선언 한 뒤
////        1,2,3, ~ 12까지의 숫자값 각 배열에 할당
//        int[][] arr4 = new int[3][4];
//        int count = 1;
//        for(int i=0; i<arr4.length; i++){
////            int count = 1; //{1,2,3,4}, {1,2,3,4}, {1,2,3,4}
//            for(int j=0; j<arr4[i].length; j++){
//                arr4[i][j] = count;
//                count ++;
//            }
////            count++; //1,1,1,1 2,2,2,2 3,3,3,3
//        }
//        System.out.println(Arrays.deepToString(arr4));

////        가변배열만들기 : 전체사이즈 5
////        각 배열마다 사이즈 1,2,3,4,5로 커지도록 : for문
////        각사이즈별로 1은 10이 모두 들어가고, 2는 20이 모두 들어가고, 3은 30이 모두 들어가도록
//        int[][] arr5 = new int[5][];
//        int count = 1;
//        for(int i=0; i<arr5.length; i++){
//            arr5[i] = new int[i+1];
//            for(int j=0; j<arr5[i].length; j++){
//                arr5[i][j] = count*10;
//            }
//            count++;
//        }
//        System.out.println(Arrays.deepToString(arr5));

        List<Integer> myList = new ArrayList<>();


















    }
}


