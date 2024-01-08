import C14Interface.Bank.Model.BankAccount;

import java.util.*;
class test3 {
    public static void main(String[] args) {
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished ={true, false, true, false};
        List<String> list = new ArrayList<>();

<<<<<<< HEAD
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
=======
        String my_string = "banana";
        String is_prefix = "ban";
            if(my_string.length()<is_prefix.length()){
                System.out.println(0);
            }
            String a = my_string.substring(0,is_prefix.length());
            if(a.equals(is_prefix)){
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }

>>>>>>> 6020ba33decceed2769a5cd9f532c0ba3cf97061
    }
}
