import C14Interface.Bank.Model.BankAccount;

import java.util.*;
public class test3 {

    private Long id;
    private String name;
    private String email;
    private String password;
    private String account; // 계좌
    private long balance; // 잔액

    public test3(Long id, String name, String email, String password, String account, long balance){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.account = account;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAccount() {
        return account;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
