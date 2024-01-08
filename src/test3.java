import C14Interface.Bank.Model.BankAccount;

import java.util.*;
class test3 {
    public static void main(String[] args) {
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished ={true, false, true, false};
        List<String> list = new ArrayList<>();

        for(int i=0; i<finished.length; i++){
            if(finished[i] == false){
                list.add(todo_list[i]);
            }
        }
        String[] answer = new String[list.size()];
        for(int i=0; i< list.size(); i++){
            answer[i] = list.get(i);
        }
        System.out.println(answer);
    }
}
