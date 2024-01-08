import C14Interface.Bank.Model.BankAccount;

import java.util.*;
class test3 {
    public static void main(String[] args) {

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

    }
}
