import java.util.*;
public class test5 {
    public static void main(String[] args) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] alpa = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String letter = ".... . .-.. .-.. ---";
        String[] a = letter.split(" ");
        String answer ="";
//        String[] answer = new String[a.length];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<morse.length; j++){
                if(a[i].equals(morse[j])){
                    answer += alpa[j];

                }
            }123123
        }
        System.out.println(answer);
    }
}
