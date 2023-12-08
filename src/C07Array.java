import java.util.Arrays;

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

////        85, 65, 90 인 int 배열을 선언한 뒤, 총합, 평균값/
//        int[] int_arr = {85,65,90};
//        int answer = 0;
//        for(int i=0; i<int_arr.length; i++){
//            answer += int_arr[i];
//        }
//        System.out.println(answer);
//        System.out.println(answer/int_arr.length);

////        최대값, 최소값
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

////        배열의 순서바꾸기 문법
//        int[] arr = {10,20};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//        System.out.println(Arrays.toString(arr));

//        0번째 index부터 마지막까지 자리 change
        int[] arr2 = {10,20,30,40,50,60,70};
        for(int i=0; i<arr2.length-1; i++){ // 10이 뒤로 가는데 까지 6번 자리가 바뀌어야 한다. .length에 -1을 하지 않으면
//            배열의 길이에 맞지 않게 for문이 돌기 때문에 에러가 난다. // ArrayIndexOutOfBoundsException 에러
            int temp = arr2[i];
            arr2[i] = arr2[i+1];
            arr2[i+1] = temp;
        }
        System.out.println(Arrays.toString(arr2));








    }
}
