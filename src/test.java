import java.util.regex.Pattern;
class Solution {

    public boolean solution(String s) {
        boolean answer = false;
        s = "1234";
        if(s.length() == 4 || s.length() == 6){
            if(Pattern.matches("[0-9]+", s)){
                answer = true;
            }
        }
        return answer;
    }
}

import java.util.regex.Pattern;

class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        if(s.length() == 4 || s.length() == 6){
            if(Pattern.matches("[0-9]+", s)){
                answer = true;
            }
        }
        return answer;
    }
}



//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class test {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String answer = "";
//        for(int i=1; i<=n; i++){
//            answer += "*";
//            System.out.println(answer);
//            }
//
//
//
////            if(i==1){
////                System.out.println("*");
////            } else if(i==2){
////                System.out.println("**");
////            } else if(i==3){
////                System.out.println("***");
////            }
//
//    }
//}



//class Solution {
//    public String solution(String my_string, int n) {
//        String answer = "";
//        for(int i=0; i<my_string.length(); i++){
//            for(int j=0; j<n; j++){
//                answer+=my_string.charAt(i);

//class Solution {
//    public String solution(String my_string, int n) {
//        String answer = "";
//        char[] a = new char[my_string.length()];
//        for(int i = 0; i < my_string.length(); i++) {
//            a[i] = my_string.charAt(i);
//            for(int m = 1; m <= n; m++){
//                answer += a[i];



//    String my_string = "aAb1B2cC34oOp";
//    int answer = 0;
//        for(int i=0; i<my_string.length(); i++){
//        char temp = my_string.charAt(i);
//        if(temp >= '1' && temp <= '9'){
//        answer += Character.getNumericValue(temp);
//        }
//        }
////        return answer;