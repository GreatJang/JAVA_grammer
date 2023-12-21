package C14Interface.Bank.Service;

import C14Interface.Bank.Model.BankAccount;

import java.math.BigDecimal;

public class BankCardImpl implements BankService {

    @Override
    public void deposit(BankAccount bankAccount, long money) {
        //        interface에 명시된 서비스를 실제 구현. deposit 기능 사용하겠다고 interface에서 가져옴
//        가져온 후 Cardservice 관련 서비스 구현함
    }

    @Override
    public void withdraw(BankAccount bankAccount, long money) {

    }
}
