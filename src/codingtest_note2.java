class codingtest_note2 {
    public static void main(String[] args) {
        int i = 1;
        int j = 13;
        int k = 1;
        int answer = 0;
        String f ="";
        String s = Integer.toString(k);
        for(int a=i; a<=j; a++){
            for(int b=0; b<Integer.toString(a).length(); b++){
                if(String.valueOf((Integer.toString(a).charAt(b))).equals(s)){
                    answer ++;
                }
            }
        }
        System.out.println(answer);
    }
}
