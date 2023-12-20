package C14Interface.Bank.Model;

import java.math.BigDecimal;

public class BankAccount {

    private Long id;
    private String name;
    private String email;
    private String password;
    private String account; //계좌
    private BigDecimal balance; // 잔액

    public BankAccount(Long id, String name, String email, String password, String account, BigDecimal balance) {
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

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
