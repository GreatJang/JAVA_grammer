import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, -3, 4, -5};
        Arrays.toString(numbers);
        Arrays.sort(numbers);
        int answer = 0;
        if(numbers[numbers.length-1]*numbers[numbers.length-2] > numbers[0]*numbers[1]){
            answer = numbers[numbers.length-1]*numbers[numbers.length-2];
        } else if(numbers[numbers.length-1]*numbers[numbers.length-2] < numbers[0]*numbers[1]){
            answer = numbers[0]*numbers[1];
        } else if(numbers[numbers.length-1]*numbers[numbers.length-2] == numbers[0]*numbers[1]){
            answer = numbers[0]*numbers[1];
        }
        System.out.println(numbers);


    }
}
