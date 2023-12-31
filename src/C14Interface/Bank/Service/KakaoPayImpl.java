package C14Interface.Bank.Service;

import C14Interface.Bank.Model.BankAccount;

import java.math.BigDecimal;

public class KakaoPayImpl implements BankService {
    @Override
    public void deposit(BankAccount bankAccount, long money) {
        bankAccount.setBalance(bankAccount.getBalance() + money);
//        money BigDecimal 말고 long으로 변경하기
//        interface에 명시된 서비스를 실제 구현. deposit 기능 사용하겠다고 interface에서 가져옴
//        가져온 후 kakaoPay입금 관련 서비스 구현함

    }

    @Override
    public void withdraw(BankAccount bankAccount, long money) {
        bankAccount.setBalance(bankAccount.getBalance() - money);
    }
}

