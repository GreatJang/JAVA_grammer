class test {
    public int solution(int n) {
        n = 7; //3! 3출력
//        i! ≤ n
        int answer = 1;
        for (int i = 2; i <= 10; i++) {
            answer = answer * i;
        }
        return answer;
    }
}