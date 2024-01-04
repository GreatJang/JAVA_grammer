class test {
    static int[][] static_computers;
    public static void main(String[] args) {
        int n = 3;
        int[][] computers ={{1,1,0},{1,1,1},{0,1,1}};
        static_computers = computers;
        dfs(0);




    }
    static void dfs(int start){
        System.out.println(start);
        int count=0;
        for(int i=0; i< static_computers.length; i++){
            if(static_computers[start][i]==1){
                dfs(i);
            }
        }
    }
}