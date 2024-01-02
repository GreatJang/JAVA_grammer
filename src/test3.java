import C14Interface.Bank.Model.BankAccount;

import java.util.*;
class test3 {
    public static void main(String[] args) {
//        int n = 45;
//        String a = Integer.toString(n,3);
//        char[] arr = a.toCharArray();
//
//        for (int i = 0; i < a.length()/2; i++) {
//            char temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }
//        String answer = new String(arr);
//        System.out.println(Integer.parseInt(answer,3));

        int n = 125;
        int answer = 0;
        String temp = "";
        while(n>0){ // 3진법으로 변환 로직
            temp += Integer.toString(n %3);
            n /=3;
        }
        int temp_length = temp.length()-1;
        for(int i=0; i<temp.length(); i++){
            answer += Integer.parseInt(String.valueOf(temp.charAt(i))) * (int)Math.pow(3, temp_length);
            temp_length--;
        }
        System.out.println(answer);
    }
}
