package C14Interface.Bank.Service;

import C14Interface.Bank.Model.BankAccount;

import java.math.BigDecimal;

// interface = 각각의 서비스에서 공통으로 사용하는 서비스를 모아놓음? 서비스 선언?
public interface BankService {
    void deposit(BankAccount bankAccount, BigDecimal money); // 입금 // 변동되는 값을 변수로? // 사용자가 가져오는 값 변수 선언?
//    bankAccountm money 변수.

    void withdraw(BankAccount bankAccount, BigDecimal money); // 출금
}
