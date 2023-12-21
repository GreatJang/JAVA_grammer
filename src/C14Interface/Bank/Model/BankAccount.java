package C14Interface.Bank.Model;

//인터페이스 실습
//        -1)BankController 클래스:사용자 요청처리
//        -2)BankService 인터페이스
//        -3)BankService 구현체:BankCardService,BankKapaySerice 예금,적금 부분넣기
//        -4)BankAccount 엔티티

import java.math.BigDecimal;

public class BankAccount {

    private Long id;
    private String name;
    private String email;
    private String password;
    private String account; //계좌
    private long balance; // 잔액

    public BankAccount(Long id, String name, String email, String password, String account, long balance) {
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
