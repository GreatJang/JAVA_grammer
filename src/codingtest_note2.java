import java.util.Arrays;

class codingtest_note2 {
    public static void main(String[] args) {
        int[] array = {3, 10, 28};
        int n = 20;
        int temp = 0;
        int[] arr = new int[array.length];
        for(int i=0; i<array.length; i++){
            int a = n - array[i];
            if(a<0){
                arr[i] = a*-1;
            }
            else {
                arr[i] = a;
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<arr[i+1]){
                temp = arr[i];
            }
            else if(arr[i]>arr[i+1]){
                temp = arr[i+1];
            }
        }
        System.out.println(temp);
        System.out.println(Arrays.asList(arr).indexOf(8));
//        System.out.println(arr[b]);
    }
}
